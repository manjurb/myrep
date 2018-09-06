package com.majnu.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springcoreadvanced/injecting/interfaces/annotations/listconfig.xml"); 
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		bo.placeOrder();
	}

}
