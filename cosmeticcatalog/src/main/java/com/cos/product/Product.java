package com.cos.product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**hibernate will automatically translate this Entity into a table*/
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String productName;
	private String brand;
	private double price;
	void setProductName(String name) {
		this.productName=name;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getProductName() {
		return productName;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
