package com.microservicefive.models.service;

// import java.io.File;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.microservicefive.models.entity.Root;

@Service
public class XmlToJsonService {

    public String convertXmlToJson() throws Exception {

    	ClassPathResource resource = new ClassPathResource("files/myXMLFile0.xml");
        
        System.out.println("llego aca");
        
        ObjectMapper xmlMapper = new XmlMapper();
        Root root = xmlMapper.readValue(resource.getInputStream(), Root.class);

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(root);

        return json;
    }
}