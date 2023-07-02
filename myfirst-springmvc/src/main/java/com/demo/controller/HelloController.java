package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping("sayHello")
	public ModelAndView myFirstAction() {
		
		String message = "Have fun Learning Spring MVC";

		
		return new ModelAndView("hello","SimpleMessage",message);
		
	}

}
