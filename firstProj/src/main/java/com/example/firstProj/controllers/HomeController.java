package com.example.firstProj.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return ("Hello Java");
	}
	@RequestMapping("/random")
	private String random() {
		return ("I am glad you made it!");
	}
}
