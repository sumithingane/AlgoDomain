package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "four_wheeler")
public class FourWheeler {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
	String brand;
	String color;
	int price;
	String fuel;
	
	public FourWheeler() {
		
	}

	public FourWheeler(Integer id, String brand, String color, int price, String fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuel = fuel;
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

	@Override
	public String toString() {
		return "FourWheeler [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", fuel=" + fuel
				+ "]";
	}
	
	
}
