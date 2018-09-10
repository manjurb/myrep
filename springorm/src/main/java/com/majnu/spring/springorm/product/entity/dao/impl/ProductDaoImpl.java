package com.majnu.spring.springorm.product.entity.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.majnu.spring.springorm.product.entity.Product;
import com.majnu.spring.springorm.product.entity.dao.ProductDao;

@Component("productDao")
public class ProductDaoImpl implements ProductDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product)
	{
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
		
	}
	@Override
	@Transactional
	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}
	@Override
	@Transactional
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}
	
	@Override
	public Product find(int id) {
		Product product=hibernateTemplate.get(Product.class, id);
		return product;
	}
	@Override
	public List<Product> findAll() {
	List<Product> products = hibernateTemplate.loadAll(Product.class);
	return products;
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
