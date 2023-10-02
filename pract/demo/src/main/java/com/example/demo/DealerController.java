package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DealerController {
	
	@Autowired
	private DealerRepo dealerRepo;
	
	@GetMapping("/dealerRegistration")
		public String Dealer() {
		System.out.println("Dealer Printed");
		return "dealerRegistration";
	}

	@PostMapping("/dealerRegistration")
public String dealerRegistration(@ModelAttribute DealerRegistration dealerRegistration) {
		System.out.println(dealerRegistration.toString());
		dealerRepo.save(dealerRegistration);
		System.out.println("Dealer save successfully");
	return "dealerRegistration";
}
	
	
}
