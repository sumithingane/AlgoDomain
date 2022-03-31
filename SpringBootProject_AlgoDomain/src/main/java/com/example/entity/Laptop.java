package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
	int ram;
	String cpu;
	int screenSize;
	String gpu;
	String brand;
	int price;
	
	public Laptop()
	{
		
	}

	public Laptop(Integer id, int ram, String cpu, int screenSize, String gpu, String brand, int price) {
		super();
		this.id = id;
		this.ram = ram;
		this.cpu = cpu;
		this.screenSize = screenSize;
		this.gpu = gpu;
		this.brand = brand;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", ram=" + ram + ", cpu=" + cpu + ", screenSize=" + screenSize + ", gpu=" + gpu
				+ ", brand=" + brand + ", price=" + price + "]";
	}

	
	
	
}
