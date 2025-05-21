package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@GetMapping("/plus")
	public String search(Model model, @RequestParam(name = "first", defaultValue = "10") int a, @RequestParam(name = "secound", defaultValue = "1") int b) {
		int result = a + b;
		
		model.addAttribute("firstNumber", a);
		model.addAttribute("secoundNumber", b);
		model.addAttribute("result", result);
		return "greeting";
	}
	

}
