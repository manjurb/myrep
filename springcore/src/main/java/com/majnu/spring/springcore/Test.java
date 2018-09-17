package com.majnu.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("The Employee Id is "+emp.getId());
		System.out.println("The Employee Name is "+emp.getName());
	}

}
