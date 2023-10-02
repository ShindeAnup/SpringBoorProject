package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssignDealerController {
	@RequestMapping("/assignDealer")
	public String assignDealer() {
		return "assignDealer";
	}

}
