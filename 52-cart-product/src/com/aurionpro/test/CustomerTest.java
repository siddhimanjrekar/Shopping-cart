package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {
	public static void main(String[] args) {
		// List of products
		List<Product> productList = Arrays.asList(
        new Product(1, "Laptop", 1000.0, 100.0),
        new Product(2, "Smartphone", 500.0, 50.0),
        new Product(3, "Headphones", 50.0, 5.0)
        );
		
		// List of LineItems
        List<LineItem> lineItemList = Arrays.asList(
            new LineItem(101, 2, productList.get(0)),
            new LineItem(102, 3, productList.get(1)),
            new LineItem(103, 1, productList.get(2))
        );
        
        // List of Orders
        List<Order> orderList = Arrays.asList(
            new Order(1001, new Date(), lineItemList),
            new Order(1002, new Date(), lineItemList)
        );
        
        
        // Display information about each product
        for (Product product : productList) {
            System.out.println(product);
            System.out.println("Discounted Price: " + product.calculateDiscountedPrice());
            System.out.println();
        }
        
        System.out.println("----------------------------------------------------------------------------");
        
        // Display information about each line item
        for (LineItem lineItem : lineItemList) {
            System.out.println(lineItem);
            System.out.println("Line Item Cost: " + lineItem.calculateLineItemCost());
            System.out.println();
        }
        
        System.out.println("----------------------------------------------------------------------------");
        
        // Display information about each order
        for (Order order : orderList) {
            System.out.println(order);
            System.out.println("Total Order Price: " + order.calculateOrderPrice());
            System.out.println();
        }
        
        System.out.println("----------------------------------------------------------------------------");
        
        // Create a Customer using the list of Orders
        Customer customer = new Customer(500, "Siddhi", orderList);

        // Display information about the customer and their orders
        System.out.println(customer);
        System.out.println("Total Orders Price for customer: " + customer.calculateTotalOrdersPrice());
        
	}

}
