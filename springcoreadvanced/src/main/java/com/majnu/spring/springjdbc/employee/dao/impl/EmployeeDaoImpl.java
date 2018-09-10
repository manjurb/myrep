package com.majnu.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.majnu.spring.springjdbc.employee.dao.EmployeeDao;
import com.majnu.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.majnu.spring.springjdbc.employee.dto.Employee;
@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
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
	@Override
	public Employee read(int id) {
		String sql="select * from Employee where id=?";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
		
	}
	@Override
	public List<Employee> read() {
		String sql="select * from Employee";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		List<Employee> result=jdbcTemplate.query(sql, rowmapper);
		return result;
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
