package com.microserviceone.models.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduct")
	private Long idProduct;
	
	@OneToOne
	@JoinColumn(name = "id_persona")
	private Person Person;
	
	private Date fechaCreacion;
    private int random;
    private float randomFloat;
    private boolean bool;
    private String date;
    private String regEx;
    private String enumValue;
    private List<String> elts;
    
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person persona) {
		Person = persona;
	}
	public List<String> getElts() {
		return elts;
	}
	public void setElts(List<String> elts) {
		this.elts = elts;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
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
	public boolean getBool() {
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
	
	public Product(Person Person, Date fechaCreacion, int random, float randomFloat, boolean bool, String date,
			String regEx, String enumValue, List<String> elts) {
		this.Person = Person;
		this.fechaCreacion = fechaCreacion;
		this.random = random;
		this.randomFloat = randomFloat;
		this.bool = bool;
		this.date = date;
		this.regEx = regEx;
		this.enumValue = enumValue;
		this.elts = elts;
	}
	public Product() {
	}
	
	
}
