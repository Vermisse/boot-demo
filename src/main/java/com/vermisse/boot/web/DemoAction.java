package com.vermisse.boot.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.vermisse.boot.service.*;

@Controller
public class DemoAction {
	
	@Autowired
	private DemoService service;
	
	@GetMapping("/")
	String index(Model model) {
		model.addAttribute("user", service.getUser());
		return "demo";
	}
}