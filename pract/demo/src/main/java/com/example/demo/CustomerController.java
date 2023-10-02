package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class CustomerController {

	@Autowired
	CustomerRepo customerRepo;
	
	@GetMapping("/customerRegistration")
	public String Customer() {
		return "customerRegistration";
	}
	
	@PostMapping("/customerRegistration")
	public String customerRegistration(@ModelAttribute CustomerRegistration customerRegistration) {
		System.out.println(customerRegistration.toString());
		customerRepo.save(customerRegistration);
		return "customerRegistration";
		
	}
}


