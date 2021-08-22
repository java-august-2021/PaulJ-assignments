package com.example.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHuman {
	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
		model.addAttribute("search", searchQuery);
		if (searchQuery==null) {
			return "default.jsp";
		}
		return "index.jsp";
    }
}
