package com.majnu.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.majnu.spring.springjdbc.employee.dao.EmployeeDao;
import com.majnu.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql="insert into Employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}
	@Override
	public int update(Employee employee) {
		String sql="update Employee set firstname=?,lastname=? where id=?";
		int result=jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}
	@Override
	public int delete(int id) {
		String sql="delete from Employee where id=?";
		int result=jdbcTemplate.update(sql,id);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
