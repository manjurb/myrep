package com.majnu.spring.springcoreadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO
{
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
