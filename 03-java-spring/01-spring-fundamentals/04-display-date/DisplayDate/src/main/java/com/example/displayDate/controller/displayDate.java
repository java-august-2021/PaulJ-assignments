package com.example.displayDate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displayDate {
	@RequestMapping("/")
	private String index(){
		return "index.jsp";
	}
	@RequestMapping("/date")
	private String date() {
		return "date.jsp";
	}
	@RequestMapping("/time")
	private String time() {
		return "time.jsp";
	}


}
