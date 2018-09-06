package com.majnu.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcore/propertyplaceholder/config.xml");
		MyDAO myDAO=(MyDAO)ctx.getBean("myDAO");
		System.out.println(myDAO);
	}

}
