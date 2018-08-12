package com.easylearnjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController {
	
	@RequestMapping(value="/welcome")
	public String welcomeUserMessage(Model model){
		
		model.addAttribute("message","Hello Welcome to Spring mvc");
		return "hello";
		
	}
	

}
