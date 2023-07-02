package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LoginForm;

@Controller

public class LoginController {

	@RequestMapping(method = RequestMethod.GET, path = "customerLogin")
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "login"; //view page name
		
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "customerLogin")
	public String processLoginForm(Map model, @Valid LoginForm loginForm, BindingResult result) {
		
		
		if(result.hasErrors()) {
			return "login";
		}
		
		if(loginForm.getUsername().equals("Admin")&& loginForm.getPassword().equals("admin123")) {
			
			model.put("welcomeMessage", "Login Successful.");
			return "welcome";
		}
		
		model.put("errorMessage", "BuzzOff!");
		
		
		return "error";
		
	}
	
	
}
