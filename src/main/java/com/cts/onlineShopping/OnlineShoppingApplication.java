package com.cts.onlineShopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.onlineShopping.model.Admin;
import com.cts.onlineShopping.model.Customer;
import com.cts.onlineShopping.model.Product;
import com.cts.onlineShopping.repo.AdminRepo;
import com.cts.onlineShopping.repo.CustomerRepo;
import com.cts.onlineShopping.repo.ProductRepo;

@SpringBootApplication
public class OnlineShoppingApplication{
	
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	ProductRepo productRepo;
	
	
	public static void main(String[] args) {
		System.out.println("Helo from main");
		SpringApplication.run(OnlineShoppingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		adminRepo.save(new Admin("abcd","ab","cd"));
//		customerRepo.save(new Customer("email.com","ab","bc","abbc", "pass","20938409"));
//		productRepo.save(new Product("stuff","nice stuff",80,"has a lot of stuff",true, 0, 2));
//	}

}
