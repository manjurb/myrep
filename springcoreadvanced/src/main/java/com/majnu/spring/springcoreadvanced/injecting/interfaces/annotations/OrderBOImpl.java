package com.majnu.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO
{
	@Autowired
	private OrderDAO dao;
	@Override
	public void placeOrder() 
	{
		// TODO Auto-generated method stub
		System.out.println("Inside placeOrder() method");
		dao.createOrder();
	}
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
