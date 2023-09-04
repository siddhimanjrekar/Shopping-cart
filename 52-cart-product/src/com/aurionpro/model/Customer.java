package com.aurionpro.model;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders;
	
	public Customer(int id, String name, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	// Calculate the total price of all orders for the customer
    public double calculateTotalOrdersPrice() {
        double total = 0.0;
        for (Order order : orders) {
            total += order.calculateOrderPrice();
        }
        return total;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}
	
	
	

}
