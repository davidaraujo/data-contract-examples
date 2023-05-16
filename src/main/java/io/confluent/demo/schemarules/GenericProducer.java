package io.confluent.demo.schemarules;

import io.confluent.demo.schemarules.pojo.avro.Customer;
import io.confluent.demo.schemarules.utils.ClientsUtils;
import io.confluent.demo.schemarules.utils.ConsoleColors;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.log4j.Logger;
import java.util.Properties;
import java.util.Random;

public class GenericProducer {

    protected static final Logger logger = Logger.getLogger(GenericProducer.class);
    private static Properties props;
    private String topic;

    GenericProducer(String propertiesFile) {
        try {

            // SR properties
            props = ClientsUtils.loadConfig(propertiesFile);
            props.put("key.serializer", StringSerializer.class);
            props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
            props.put("auto.register.schemas", "false");
            props.put("use.latest.version", "true");
            props.put("latest.compatibility.strict", "false");

            // Good data quality topic
            topic = props.getProperty("customer.topic");

            // CEL rules executor - only need to pass one schema rule for each of the classes used, ie CelExecutor and CelFieldExecutor
            props.put("rule.executors", "checkSSN,checkChannel");
            props.put("rule.executors.checkSSN.class", "io.confluent.kafka.schemaregistry.rules.cel.CelExecutor");
            props.put("rule.executors.checkChannel.class", "io.confluent.kafka.schemaregistry.rules.cel.CelFieldExecutor");

            // DLQ settings
            props.put("rule.actions", "checkEmail,checkAge,checkActive");
            // checkEmail DLQ settings
            props.put("rule.actions.checkEmail.class","io.confluent.kafka.schemaregistry.rules.DlqAction");
            props.put("rule.actions.checkEmail.param.topic", props.getProperty("dlq.topic.bademail"));
            props.put("rule.actions.checkEmail.param.bootstrap.servers", props.getProperty("bootstrap.servers"));
            props.put("rule.actions.checkEmail.param.security.protocol", props.getProperty("security.protocol"));
            props.put("rule.actions.checkEmail.param.sasl.jaas.config", props.getProperty("sasl.jaas.config"));
            props.put("rule.actions.checkEmail.param.sasl.mechanism", props.getProperty("sasl.mechanism"));
            // checkAge DLQ settings
            props.put("rule.actions.checkAge.class","io.confluent.kafka.schemaregistry.rules.DlqAction");
            props.put("rule.actions.checkAge.param.topic", props.getProperty("dlq.topic.badage"));
            props.put("rule.actions.checkAge.param.bootstrap.servers", props.getProperty("bootstrap.servers"));
            props.put("rule.actions.checkAge.param.security.protocol", props.getProperty("security.protocol"));
            props.put("rule.actions.checkAge.param.sasl.jaas.config", props.getProperty("sasl.jaas.config"));
            props.put("rule.actions.checkAge.param.sasl.mechanism", props.getProperty("sasl.mechanism"));
            // checkActive DLQ settings
            props.put("rule.actions.checkActive.class","io.confluent.kafka.schemaregistry.rules.DlqAction");
            props.put("rule.actions.checkActive.param.topic", props.getProperty("dlq.topic.badstatus"));
            props.put("rule.actions.checkActive.param.bootstrap.servers", props.getProperty("bootstrap.servers"));
            props.put("rule.actions.checkActive.param.security.protocol", props.getProperty("security.protocol"));
            props.put("rule.actions.checkActive.param.sasl.jaas.config", props.getProperty("sasl.jaas.config"));
            props.put("rule.actions.checkActive.param.sasl.mechanism", props.getProperty("sasl.mechanism"));

        } catch (Exception e) {
            logger.error("Error in constructor: " + e.getMessage());
        }
    }

    public void runProducer() {

        // Set key - string
        String key = String.valueOf(new Random().nextInt(1000));

        // Set value - customer object
        Customer value = new Customer();
        value.setSsn("123456789"); // rule: ssn size = 9 digits
        value.setAddress("#10 abc, CA 94402"); // rule: address matches regex
        value.setEmail("david@confluent.io"); // rule: email contains @
        value.setUserId("uid_23434"); // rule: user_id starts with uid_
        value.setAge(18); // rule: age >= 18
        value.setActive(true); // rule: active field is true
        value.setBalance(10); // rule:  balance>= 0.0
        value.setIBAN("GB33BUKB20201555555555"); // rule: transform with xxx
        value.setAcquisitionChannel("tablet"); // rule: if not mobile or web replace with unknown

        // Create a producer
        Producer producer = new KafkaProducer<>(props);

        // Create a record
        ProducerRecord<String, Object> record = new ProducerRecord<>(topic, key, value);

        try {
            // Produce the record
            RecordMetadata metadata = (RecordMetadata) producer.send(record).get();

            /*System.out.printf(ConsoleColors.GREEN + "Record sent to topic " + topic + " with key %s and value %s to partition %d with offset %d%n",
                    key, value, metadata.partition(), metadata.offset()); */
           logger.debug("Record sent to topic " + topic
                           + " with key " + key
                           + " and value " + value.toString()
                           + " to partition " + metadata.partition()
                           + " with offset " +  metadata.offset());

        } catch (Exception e) {
            logger.error(e.getMessage(), e.fillInStackTrace());
        } finally {
            // Close the producer
            producer.close();
        }
    }

    public static void main(final String[] args) throws Exception {
        int numArgs = args.length;
        if (numArgs < 1) {
            logger.error("Required arguments: properties-file");
            System.exit(1);
        } else {
            try {
                GenericProducer producer = new GenericProducer(args[0]);
                producer.runProducer();
            } catch (Exception e) {
                logger.error(e.getMessage(), e.fillInStackTrace());
            }
        }
        Thread.sleep(5000);
    }
}