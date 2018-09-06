package com.majnu.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql="insert into Employee values(?,?,?)";
		int result=jdbcTemplate.update(sql, new Integer(1),"Manjunath","Bhapri");
		System.out.println("No of records inserted are "+result);
	}

}
