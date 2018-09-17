package com.majnu.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/majnu/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("--------------------------------------------");
		System.out.println("The Hospital name is " + hospital.getName());
		System.out.println("Departments of " + hospital.getName() + " are " + hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
		ctx.registerShutdownHook();
	}

}
