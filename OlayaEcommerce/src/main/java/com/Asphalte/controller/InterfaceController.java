package com.Asphalte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterfaceController {
	
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/category")
	public String Categorie() {
		return "category";
	}

	@RequestMapping(value = "/single-product")
	public String singleproduct() {
		return "single-product";
	}
	
	@RequestMapping(value = "/checkout")
	public String checkoutadd() {
		return "checkout";
	}

}
