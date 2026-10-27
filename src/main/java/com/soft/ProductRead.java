package com.soft;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.soft.entity.Product;

public class ProductRead {
	
	public static void ReadProduct() {
		Configuration confg = new Configuration();
		confg.configure("com/soft/cnfg/hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory();
		Session session = factory.openSession();
		
		List<Product> products = session.createQuery("FROM Product", Product.class).getResultList();
		
		for (Product p : products) {
		    System.out.println("Product ID: " + p.getProductId());
		    System.out.println("Product Name: " + p.getProductName());
		    System.out.println("Company Name: " + p.getCompanyName());
		    System.out.println("Price: " + p.getPrize());
		    System.out.println("----------------------");
		}
		
		
		
	
		session.close();
		factory.close();
		
	}

}
