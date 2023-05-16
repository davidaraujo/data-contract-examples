package io.confluent.demo.schemarules;

import io.confluent.demo.schemarules.utils.ClientsUtils;
import org.apache.kafka.clients.consumer.*;
import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class GenericConsumer implements Runnable {

    private static final Logger logger = Logger.getLogger(GenericConsumer.class);
    private static Properties props;
    private String topicNames;
    private String groupId;
    private String clientId;

    public GenericConsumer(String propertiesFile,
                           String topicNames,
                           String groupId,
                           String clientId) {
        try {
            props = ClientsUtils.loadConfig(propertiesFile);
            props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
            props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaAvroDeserializer");
            if (groupId != null)
                props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
            if (clientId != null)
                props.put(ConsumerConfig.CLIENT_ID_CONFIG, clientId);
            props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
            props.put("enable.auto.commit", "true");
            props.put("auto.commit.interval.ms", "1000");
            this.topicNames = topicNames;
            this.groupId = groupId;
            this.clientId = clientId;

            // CEL rules executor - only need to pass one schema rule for each of the classes used, ie CelExecutor and CelFieldExecutor
            props.put("rule.executors", "checkSSN,checkChannel");
            props.put("rule.executors.checkSSN.class", "io.confluent.kafka.schemaregistry.rules.cel.CelExecutor");
            props.put("rule.executors.checkChannel.class", "io.confluent.kafka.schemaregistry.rules.cel.CelFieldExecutor");

        } catch (IOException e) {
            logger.error("Error in constructor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void runConsumer() throws IOException {

        // Create a consumer
        final Consumer<String, Object> consumer = new KafkaConsumer<>(props);

        try {
            // Subscribe to topic(s)
            consumer.subscribe(Arrays.asList(topicNames.split(",")));
            logger.info("Starting consumer on GenericConsumer ...");
            while (true) {
                    // Consume records
                    ConsumerRecords<String, Object> records = consumer.poll(Duration.ofMillis(10000));
                    for (ConsumerRecord<String, Object> record : records) {
                        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
                        logger.info(timeStamp + ": consumer client ID: " + clientId + ", message: " + record.value().toString());
                    }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e.fillInStackTrace());
        } finally {
            consumer.close();
            System.out.println("Closed the consumer connection");
        }
    }

    /**
     * @param args propertiesFile topicName groupID clientID
     * @param args [0] The properties filename
     * @param args [1] The name of the topics to subscribe - comma separated
     * @param args [2] The name of the group ID
     * @param args [3] The name client ID
     * @return Nothing.
     */
    public static void main(final String[] args) throws Exception {
        int numArgs = args.length;
        if (numArgs < 4) {
            System.out.println("Please provide command line arguments: propertiesFile topicNames(comma separated) groupID clientID");
            System.exit(1);
        } else {
            try {
                String propertiesFile = args[0];
                String topicNames = args[1];
                String groupId = args[2];
                String clientId = args[3];
                GenericConsumer consumer = new GenericConsumer(propertiesFile, topicNames, groupId, clientId);
                consumer.runConsumer();
            } catch (Exception e) {
                System.out.println("Error in main method: " + e.getMessage());
            }
        }
    }

    public void run() {
        try {
            this.runConsumer();
        } catch (IOException e) {
            System.out.println("IOException in run method: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception in run method: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

