package com.majnu.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.majnu.spring.springjdbc.employee.dao.EmployeeDao;
import com.majnu.spring.springjdbc.employee.dto.Employee;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/majnu/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao=(EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Aishu");
		employee.setLastName("Biradar");
		int result=dao.create(employee);
		System.out.println("No of records inserted are "+result);
	}

}
