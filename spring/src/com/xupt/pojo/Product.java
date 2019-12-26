package com.xupt.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private String name;
	private float price;
	@Resource(name="c")
	private Category category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
