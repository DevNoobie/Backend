package com.cts.onlineShopping.model;

import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
@Generated
@Data
@Document(collection = "Customer")
@AllArgsConstructor
public class Customer {
	
	@Id
	private String loginId;
	@Field
	private String email;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String password;
	@Field
	private String contactNumber;

}
