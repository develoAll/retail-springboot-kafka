package com.microservicefive.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic generateTopic() {
		
		// MAP DE CONFIGURACIONES
		Map<String, String> configuration = new HashMap<>();
		configuration.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE); // DESPUES DE CIERTO TIEMPO BORRRA EL MENSAJE
		configuration.put(TopicConfig.RETENTION_MS_CONFIG, "7200000"); // RETIENE EL MENSAJE POR 2 HORAS
		configuration.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824"); // TAMAÑO MAXIMO DEL SEGMENTO - 1GB
		configuration.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); // TAMAÑO MAXIMO DE CADA MENSAJE - DEFECTO 1MB
		
		return TopicBuilder.name("example-topic")
				.partitions(2)
				.replicas(2)
				.configs(configuration)
				.build();
	}
	
}
