package com.majnu.spring.springcore.reftypes;

public class ShoppingCart 
{
	public ShoppingCart(Item item) {
		super();
		this.item = item;
	}

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
