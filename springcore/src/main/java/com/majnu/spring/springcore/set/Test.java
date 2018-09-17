package com.majnu.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcore/set/setconfig.xml");
	CarDealer cardealer = (CarDealer) ctx.getBean("cardealer");
	System.out.println("--------------------------------------------");
	System.out.println("The Cardealer name is "+cardealer.getName());
	System.out.println("The models he has are "+cardealer.getModels());
	System.out.println("----------------------------------------------");
	}
}
