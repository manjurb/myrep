package com.majnu.spring.springjdbc.employee.dao;

import com.majnu.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao 
{
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
}
