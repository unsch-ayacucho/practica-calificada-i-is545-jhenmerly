package edu.pe.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pe.unsch.service.ProductService;



@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("titulo", "Home : e-renmate");
		model.addAttribute("classActive", "active");
		return "views/public/home/index";
	}

}
