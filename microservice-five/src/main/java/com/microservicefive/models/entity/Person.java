package com.microservicefive.models.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Person {
	
	@JacksonXmlProperty(isAttribute = true, localName = "firstname")
    private String firstName;

    @JacksonXmlProperty(isAttribute = true, localName = "lastname")
    private String lastName;

    @JacksonXmlProperty(isAttribute = true, localName = "city")
    private String city;

    @JacksonXmlProperty(isAttribute = true, localName = "country")
    private String country;
    
    @JacksonXmlProperty(isAttribute = true, localName = "firstname2")
    private String firstName2;

    @JacksonXmlProperty(isAttribute = true, localName = "lastname2")
    private String lastName2;
    
    @JacksonXmlProperty(isAttribute = true, localName = "email")
    private String email;
    
    public String getFirstName2() {
		return firstName2;
	}

	public void setFirstName2(String firstName2) {
		this.firstName2 = firstName2;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

    
}