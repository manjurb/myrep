package com.majnu.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println("The Customer Id is "+customer.getId());
		System.out.println("The Employee Name is "+customer.getProducts());
	}

}
