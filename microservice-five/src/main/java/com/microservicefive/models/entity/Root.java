package com.microservicefive.models.entity;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "root")
public class Root {
    @JacksonXmlProperty(localName = "person")
    private Person person;
    
    @JacksonXmlProperty(localName = "random")
    private int random;
    
    @JacksonXmlProperty(localName = "random_float")
    private float randomFloat;
    
    @JacksonXmlProperty(localName = "bool")
    private boolean bool;
    
    @JacksonXmlProperty(localName = "date")
    private String date;
    
    @JacksonXmlProperty(localName = "regEx")
    private String regEx;
    
    @JacksonXmlProperty(localName = "enum")
    private String enumValue;
    
    @JacksonXmlProperty(localName = "elt")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> elts;
    
    // private Map<String, Name> dynamicElement;

    
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public float getRandomFloat() {
		return randomFloat;
	}

	public void setRandomFloat(float randomFloat) {
		this.randomFloat = randomFloat;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	public String getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

	public List<String> getElts() {
		return elts;
	}

	public void setElts(List<String> elts) {
		this.elts = elts;
	}
 /*
	public Map<String, Name> getDynamicElement() {
		return dynamicElement;
	}

	public void setDynamicElement(Map<String, Name> dynamicElement) {
		this.dynamicElement = dynamicElement;
	}
*/
    
}
