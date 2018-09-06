package com.majnu.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShoppingCart 
{
	
	
	


	@Qualifier("item4")
	private Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item.getId() +" "+item.getName()+" "+item.getPrice()+" "+item.getQuantity() +"]";
	}

	public Item getItem() 
	
	
	{
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
}
