package com.example.dojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	@RequestMapping("/user")
	public String user(@RequestParam("your_name") String yourName,
			@RequestParam("location") String location,
			@RequestParam("Language") String language, 
			@RequestParam("description")String comment,
			Model userModel) {
		userModel.addAttribute("your_name", yourName);
		userModel.addAttribute("location", location);
		userModel.addAttribute("Language", language);
		userModel.addAttribute("description", comment);
		
		return "user.jsp";
	}	

}
