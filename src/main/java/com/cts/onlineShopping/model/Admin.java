package com.cts.onlineShopping.model;

import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;

@Generated
@Data
@AllArgsConstructor
@Document(collection = "Admin")
public class Admin {
	
	@Id
	private String email;
	@Field
	private String fullName;
	@Field
	private String password;
	
}
