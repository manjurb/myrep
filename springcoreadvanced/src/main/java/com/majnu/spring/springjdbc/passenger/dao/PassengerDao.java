package com.majnu.spring.springjdbc.passenger.dao;

import java.util.List;

import com.majnu.spring.springjdbc.passenger.dto.Passenger;

public interface PassengerDao {
	
	int create(Passenger passenger);
	
	int update(Passenger passenger);
	
	int delete(Passenger passenger);
	
	List<Passenger> read();

}
