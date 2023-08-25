package com.microservicefive.models.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XMLFileReader {
	 public String readXML(String xmlFilePath) throws IOException {
        Path path = Path.of("src/main/resources/" + xmlFilePath);
        return Files.readString(path);
    }
}
