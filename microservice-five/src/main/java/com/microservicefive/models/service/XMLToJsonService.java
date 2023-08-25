package com.microservicefive.models.service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class XMLToJsonService {
	 public String convertXMLToJson(String xmlContent) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        JsonNode node = xmlMapper.readTree(xmlContent);
        
        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(node);
    }
}
