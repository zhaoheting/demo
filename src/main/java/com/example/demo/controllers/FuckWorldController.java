package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuckWorldController {


	@RequestMapping("/fuck")
	public String fuckWorld() {
		return "";
	}
	
	@RequestMapping("/fuckEmail")
	public String fuckWorldByEmail() {
		return "";
	}
	
}
