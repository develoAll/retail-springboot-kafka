package com.microserviceone.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate date_create;
	private int random;
	private double random_float;
	private boolean bool;
	private String regex;
	private String enun;
	private String elt;
	private int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate_create() {
		return date_create;
	}
	public void setDate_create(LocalDate date_create) {
		this.date_create = date_create;
	}
	public int getRandom() {
		return random;
	}
	public void setRandom(int random) {
		this.random = random;
	}
	public double getRandom_float() {
		return random_float;
	}
	public void setRandom_float(double random_float) {
		this.random_float = random_float;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	public String getEnun() {
		return enun;
	}
	public void setEnun(String enun) {
		this.enun = enun;
	}
	public String getElt() {
		return elt;
	}
	public void setElt(String elt) {
		this.elt = elt;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Product() {
	}

	
	public Product(Long id, LocalDate date_create, int random, double random_float, boolean bool, String regex,
			String enun, String elt, int age) {
		this.id = id;
		this.date_create = date_create;
		this.random = random;
		this.random_float = random_float;
		this.bool = bool;
		this.regex = regex;
		this.enun = enun;
		this.elt = elt;
		this.age = age;
	}

}
