package com.majnu.spring.springjdbc.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.majnu.spring.springjdbc.passenger.dao.PassengerDao;
import com.majnu.spring.springjdbc.passenger.dto.Passenger;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext(" com/majnu/spring/springjdbc/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) ctx.getBean("passengerDao");
		Passenger passenger=new Passenger();
		passenger.setId(2);
		passenger.setFirstname("Suneel");
		passenger.setLastname("Pujari");
		//int result=dao.create(passenger);
		//int result=dao.update(passenger);
		//int result=dao.delete(passenger);
		//System.out.println(result);
		List<Passenger> result=dao.read();
		System.out.println(result);
	}
}
