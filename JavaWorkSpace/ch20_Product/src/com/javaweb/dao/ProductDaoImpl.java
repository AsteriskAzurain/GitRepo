package com.javaweb.dao;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	// 添加产品
	public void save(Product p) {
		this.getHibernateTemplate().save(p);
	}

	// 删除产品
	public void delete(String id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(Product.class, id));
	}

	//更新产品
	public void update(Product p) {
		this.getHibernateTemplate().saveOrUpdate(p);
	}

	//查询所有产品
	public List queryAll() {
		return this.getHibernateTemplate().find("from Product");
	}

	//按id查询产品
	public Product queryByID(String id) {
		return (Product) this.getHibernateTemplate().get(Product.class, id);
	}

}
