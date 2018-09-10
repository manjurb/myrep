package com.majnu.spring.springjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.majnu.spring.springjdbc.passenger.dao.PassengerDao;
import com.majnu.spring.springjdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.majnu.spring.springjdbc.passenger.dto.Passenger;
@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	@Override
	public int create(Passenger passenger) {
		String sql="insert into Passenger values(?,?,?)";
		int result = jdbcTemplate.update(sql,passenger.getId(),passenger.getFirstname(),passenger.getLastname());
		return result;
	}
	@Override
	public int update(Passenger passenger) {
		String sql="update Passenger set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql,passenger.getFirstname(),passenger.getLastname(),passenger.getId());
		return result;
	}

	@Override
	public int delete(Passenger passenger) {
		String sql="delete from Passenger where id=?";
		int result = jdbcTemplate.update(sql,passenger.getId());
		return result;
	}
	
	@Override
	public List<Passenger> read() 
	{
		PassengerRowMapper rowmapper=new PassengerRowMapper();
		String sql="Select * from Passenger";
		List<Passenger> result=jdbcTemplate.query(sql, rowmapper );
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



}
