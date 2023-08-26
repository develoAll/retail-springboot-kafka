package com.microservicefive.models.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.microservicefive.models.entity.Root;

@Service
public class XmlToJsonService {

    public String convertXmlToJson(int doc) throws Exception {
    	    	
    	XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper jsonMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    	ClassPathResource resource = new ClassPathResource("files/myXMLFile"+doc+".xml");
    	Root root = xmlMapper.readValue(resource.getInputStream(), Root.class);

        //Map<String, AgeContainer> dynamicElement = new HashMap<>();
        //dynamicElement.put(root.getPerson().getFirstName2(), root.getDynamicElement().get(root.getPerson().getFirstName2()));
        //root.setDynamicElement(dynamicElement);

        return jsonMapper.writeValueAsString(root);
    }
}