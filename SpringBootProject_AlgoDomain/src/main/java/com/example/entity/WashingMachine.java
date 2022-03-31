package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="washing_machine")
public class WashingMachine {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
	String type;
	String Brand;
	String color;
	int price;
	
	public WashingMachine()
	{
		
	}
	
	public WashingMachine(Integer id, String type, String Brand, String color, int price) {
		super();
		this.id = id;
		this.type = type;
		this.Brand = Brand;
		this.color = color;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "WashingMachine [id=" + id + ", type=" + type + ", Brand=" + Brand + ", color=" + color + ", price="
				+ price + "]";
	}
	
	
	
}
