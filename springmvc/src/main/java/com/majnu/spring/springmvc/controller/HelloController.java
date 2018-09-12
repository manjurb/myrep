package com.majnu.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 1);
		modelAndView.addObject("name", "Manju");
		modelAndView.addObject("salary", 100000);
		return modelAndView;
		
	}
}
