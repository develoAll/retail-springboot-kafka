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

    public Task(XmlToJsonService xmlToJsonService) {
        this.xmlToJsonService = xmlToJsonService;
    }
	
	private String resultJson;
	private int numInitializar = 0;
	
	String directorio = "ruta/del/directorio";
	
	@Scheduled(cron = "${cron.expression}")
	public void shedulerSendXml() {
		System.out.println("Se enviara un mensaje");
		
		try {
			
			numInitializar++;
			System.out.println("*************************************************************************************");
			resultJson = xmlToJsonService.convertXmlToJson(numInitializar);
			
			kafkaTemplate.send("example-topic",resultJson);
			System.out.println(resultJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
