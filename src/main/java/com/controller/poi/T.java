package com.controller.poi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class T {
	
	@RequestMapping("/index")
	public String m1()
	{
		System.out.println("Starting Page ");
		return "index";
	}
	
	

}
