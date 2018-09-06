package com.majnu.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcoreadvanced/cartconfig.xml");
		ShoppingCart cart = (ShoppingCart) ctx.getBean("cart");
		System.out.println(cart);
		
		ShoppingCart cart1 = (ShoppingCart) ctx.getBean("cart");
		System.out.println(cart1);
	}

}
