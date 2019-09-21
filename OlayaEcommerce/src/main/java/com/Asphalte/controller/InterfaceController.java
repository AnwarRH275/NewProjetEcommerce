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

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/cart")
	public String cart() {
		return "cart";
	}
	
	@RequestMapping("/confirmation")
	private String confiramtiom() {
		// TODO Auto-generated method stub
		return "confirmation";
	}
	
	
	@RequestMapping(value = "/blog")
	private String blog() {
		return "blog";
	}
	
	@RequestMapping(value = "/single-blog")
	private String  singleBlog() {
		return "single-blog";
	}
	
	@RequestMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	
	
}
