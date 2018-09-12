package com.majnu.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.majnu.spring.springmvc.dto.Employee;
@Controller
public class ListController 
{
	@RequestMapping("/readList")
	public ModelAndView sendObject()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Manju");
		employee1.setSalary(10000);
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Venki");
		employee2.setSalary(20000);
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Amal");
		employee3.setSalary(1000);
		
		//Creating an arraylist and passingit to modelandview object for view resolver
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		modelAndView.addObject("employees",employees);
		return modelAndView;
		
	}
}
