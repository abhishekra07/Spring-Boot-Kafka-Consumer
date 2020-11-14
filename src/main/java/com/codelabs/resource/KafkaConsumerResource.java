package com.codelabs.resource;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.codelabs.model.Employee;

@Service
public class KafkaConsumerResource {

	@KafkaListener(topics = "firstTopicJson", groupId = "group_json",containerFactory = "kakfkaListener")
	public void consumer(Employee employee) {
		System.out.println("Consumed Message :- " + employee);
	}
}
