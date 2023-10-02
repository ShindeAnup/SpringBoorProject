package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		AdminRepo adminRepo = context.getBean(AdminRepo.class);
		
//		Admin admin1 = new Admin();
//		admin1.setUsername("test");
//		admin1.setPassword("test");
//		
//		
//		Admin resultAdmin = adminRepo.save(admin1);
//		System.out.println("saved user "+resultAdmin);
//		System.out.println("done");

	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
