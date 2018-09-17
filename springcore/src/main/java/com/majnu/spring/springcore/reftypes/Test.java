package com.majnu.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcore/reftypes/config.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		
	}

}
 