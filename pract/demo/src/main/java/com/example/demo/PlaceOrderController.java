package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlaceOrderController {
	
	@Autowired
	PlaceOrderRepo placeOrderRepo;
	
	@GetMapping("/placeOrder")
		public String Order() {
		return "placeOrder";
	}
	
	@PostMapping("/placeOrder")
	public String placeOrder(@ModelAttribute PlaceOrder placeOrder) {
		System.out.println(placeOrder.toString());
		placeOrderRepo.save(placeOrder);
		System.out.println("Order Placed Successfully");
	return "placeOrder";
	
	}

	@GetMapping("/assignDealer")
	public ModelAndView pendingOrder() {
		
		List<PlaceOrder> po = this.placeOrderRepo.findAll();
		
		for (PlaceOrder placeOrder : po) {
			System.out.println(placeOrder);
		}
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("assignDealer");
		mv.addObject("abc", po);
		return mv;
	}
}
