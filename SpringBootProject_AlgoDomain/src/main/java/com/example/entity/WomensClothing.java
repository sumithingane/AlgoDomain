package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "womens_clothing")
public class WomensClothing {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Integer id;
	String type;		// shirts, pants, shoes
	String Brand;
	int price;
	String size;
	
	public WomensClothing()
	{
		
	}

	public WomensClothing(Integer id, String type, String brand, int price, String size) {
		super();
		this.id = id;
		this.type = type;
		Brand = brand;
		this.price = price;
		this.size = size;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "MensClothing [id=" + id + ", type=" + type + ", Brand=" + Brand + ", price=" + price + ", size=" + size
				+ "]";
	}
	
	

}
