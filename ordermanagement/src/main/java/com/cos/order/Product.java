package com.cos.order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
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
	public String toString() {
		return productName+" "+brand;
	}
}
