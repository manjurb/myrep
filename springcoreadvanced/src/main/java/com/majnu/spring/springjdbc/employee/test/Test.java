package com.majnu.spring.springjdbc.employee.test;

import java.util.List;

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
		employee.setId(1);
		employee.setFirstName("Vinayak");
		employee.setLastName("Bhapri");
		//int result=dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(3);
		//System.out.println("No of records deleted are "+result);
		
		//Employee read = dao.read(1);
		
		List<Employee> read =dao.read();
		System.out.println(read);
		//System.out.println("No of records inserted are "+result);
	}

}
