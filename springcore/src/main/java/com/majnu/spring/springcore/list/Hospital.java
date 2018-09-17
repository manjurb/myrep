package com.majnu.spring.springcore.list;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hospital 
{
	private String name;
	private List<String> departments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	@PostConstruct
	public void hi()
	{
		System.out.println("Inside hi");
	}
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside bye");
	}

}
