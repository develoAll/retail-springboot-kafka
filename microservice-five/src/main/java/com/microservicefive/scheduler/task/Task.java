package com.microservicefive.scheduler.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@Scheduled(cron = "${cron.expression}")
	public void shedulerSendXml() {
		System.out.println("Se enviara un mensaje");
		
		kafkaTemplate.send("example-topic","Se envio pe bateria");
		
	}
	
}
