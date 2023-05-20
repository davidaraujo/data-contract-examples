## To run on Confluent Platform 7.4
Add the line `resource.extension.class=io.confluent.kafka.schemaregistry.rulehandler.RuleSetResourceExtension` to the file schema-registry.properties inside the folder $CONFLUENT_HOME/etc/schema-registry

## Topics to create
* customer
* customer-bad-email
* customer-bad-age
* customer-bad-status

## Register schema under subject name customer-value
Register the schema via the SR API directly using the file in `src/main/avro/customer-value.json` or using the maven plugin on the pom with `mvn schema-registry:register`.

## Run producer 
* Configure your Kafka and SR cluster credentials in `src/main/resources/cc-examples`
* Run the class `GenericProducer` with the properties file above as argument
* Change Customer field values on the class above to valid and invalidate the rules and experience the followup actions (like sending to a DLQ topic)