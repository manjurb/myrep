package com.majnu.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.majnu.spring.springorm.product.entity.Product;
import com.majnu.spring.springorm.product.entity.dao.ProductDao;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext(" com/majnu/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) ctx.getBean("productDao");
	/*	Product product=new Product();
		product.setId(2);
		product.setName("Book");
		product.setDesc("Its a novel");
		product.setPrice(150);
		int result=dao.create(product);*/
		//System.out.println("No of Products added to the Bag are "+result);
		//dao.update(product);
		//dao.delete(product);
		//Product product=dao.find(1);
		//System.out.println(product);
		List<Product> products = dao.findAll();
		System.out.println(products);
	}
}
