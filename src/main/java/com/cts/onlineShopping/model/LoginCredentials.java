package com.cts.onlineShopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Generated
@Data
@AllArgsConstructor
public class LoginCredentials {
	
	private String loginId;
	private String password;
	private boolean isUserAdmin;

}
