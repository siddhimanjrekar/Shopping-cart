package com.aurionpro.model;

public class Product {
	private int id;
	private String name;
	private double price; 
	private double discountPrice;
	
	public Product(int id, String name, double price, double discountPrice) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPrice = discountPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	// Calculate the discounted price
		public double calculateDiscountedPrice() {
			return price - discountPrice;
		}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discountPrice=" + discountPrice + "]";
	}

}
