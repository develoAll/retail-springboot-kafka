package com.microservicefour.models.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Person{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(mappedBy = "Person", cascade = CascadeType.ALL)
	private Product product;
	
	private String firstName;
    private String lastName;
    private String city;
    private String country;
    private String firstName2;
    private String lastName2;
    private String email;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Person(String firstName, String lastName, String city, String country, String firstName2, String lastName2,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.country = country;
		this.firstName2 = firstName2;
		this.lastName2 = lastName2;
		this.email = email;
	}
	
	public Person() {
	}
    
}

