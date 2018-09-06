package com.majnu.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/majnu/spring/springcoreadvanced/stereotype/annotations/listconfig.xml");
		Instructor instructor = (Instructor) ctx.getBean("inst");
		System.out.println(instructor);
	}

}
