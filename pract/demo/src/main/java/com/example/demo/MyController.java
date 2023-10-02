package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	@GetMapping("/home")
	public String test(Model model) {
		System.out.println("This is home page");
		model.addAttribute("Admin",new Admin());
		return "home";
	}
	
	// Handler for Admin form
	@PostMapping("/assignDealer")
public String Processform(@ModelAttribute("Admin")Admin admin) 
	{
		System.out.println("admin");
	return "assignDealer";
}
	
}