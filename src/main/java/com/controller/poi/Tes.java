package com.controller.poi;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tes {

	@Autowired
	private Details u;

	// For single value printing
	@RequestMapping(value = "/Tes", method = RequestMethod.GET)

	public ModelAndView m1(@RequestParam("lname") String name, HttpSession session) {
		ModelAndView m = new ModelAndView();
		m.addObject("uname", name);
		m.setViewName("output");
		session.setAttribute("uname", name);
		return m;
	}

	// For Object printing
	@RequestMapping(value = "/Tess", method = RequestMethod.GET)

	public ModelAndView m1(@RequestParam("lname") String name, @RequestParam("age") int age, HttpSession session) {

		u.setAge(age);
		u.setName(name);

		ModelAndView m = new ModelAndView();
		m.addObject("deta", u);
		m.setViewName("output");

		return m;

	}

}
