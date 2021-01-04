package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Consumer {
	public static void main(String[] args) {
		new Consumer().printMsg();
	}
	public void printMsg() {
		Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("group.id", "test-group");

        KafkaConsumer kafkaConsumer = new KafkaConsumer(properties);
        List topics = new ArrayList();
        topics.add("quickstart-events");
        kafkaConsumer.subscribe(topics);
        try{
            while (true){
               ConsumerRecords records = kafkaConsumer.poll(10);
               Iterator<ConsumerRecord> it= records.iterator();
               while(it.hasNext()) {
            	   System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", it.next().topic(), it.next().partition(), it.next().value()));
               }
               /*records.forEach(record->
            	   System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", record.topic(), record.partition(), record.value()))
               );*/
                
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            kafkaConsumer.close();
        }
	}
}
