package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/hello-quoc")
	public String greetingQuoc(Model model) {
		model.addAttribute("name", "Quốc");
		return "greeting";
	}
	
	@GetMapping("/hello-xuan")
	public String greetingXuan(Model model) {
		model.addAttribute("name", "Xuan");
		return "greeting";
	}
	
}
