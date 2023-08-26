package com.microservicefive.scheduler.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.microservicefive.models.service.XmlToJsonService;

@Component
public class Task {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private final XmlToJsonService xmlToJsonService;

    @Autowired
    public Task(XmlToJsonService xmlToJsonService) {
        this.xmlToJsonService = xmlToJsonService;
    }
	
	private String resultJson;
	
	@Scheduled(cron = "${cron.expression}")
	public void shedulerSendXml() {
		System.out.println("Se enviara un mensaje");
		
		try {
			resultJson = xmlToJsonService.convertXmlToJson();
			// kafkaTemplate.send("example-topic",resultJson);
			System.out.println(resultJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
