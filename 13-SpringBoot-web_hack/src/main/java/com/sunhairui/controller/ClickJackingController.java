package com.sunhairui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClickJackingController {
	
	@GetMapping("/clickjacking")
	public String clickjacking() {
		return "clickjacking.html";
	}
	
}
