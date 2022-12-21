package com.cts.onlineShopping.model;

import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
@Generated
@Data
@Document(collection = "Product")
@AllArgsConstructor
public class Product {
	
	@Id
	private String productName;
	@Field
	private String productDescription;
	@Field
	private double price;
	@Field
	private String features;
	@Field
	private String productStatus;
	@Field
	private int noOfOrders;
	@Field
	private int noOfProducts;

}
