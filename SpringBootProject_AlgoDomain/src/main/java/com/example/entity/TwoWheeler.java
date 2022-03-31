package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "two_wheeler")
public class TwoWheeler {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
	String brand;
	String color;
	int price;
	String fuel;
	String type;  		// gear , wogear
	
	public TwoWheeler() {
		
	}

	public TwoWheeler(Integer id, String brand, String color, int price, String fuel, String type) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuel = fuel;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TwoWheeler [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", fuel=" + fuel
				+ ", type=" + type + "]";
	}
	
	
}
