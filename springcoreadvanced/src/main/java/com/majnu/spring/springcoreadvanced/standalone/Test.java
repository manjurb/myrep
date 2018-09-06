package com.majnu.spring.springcoreadvanced.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/majnu/spring/springcoreadvanced/standalone/listconfig.xml");
		ProductsList pl = (ProductsList) ctx.getBean("productsList");
		System.out.println(pl);

	}

}
