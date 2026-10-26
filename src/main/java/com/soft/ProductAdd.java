package com.soft;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Product;

public class ProductAdd {
    public void AddProduct() {
    	 
    	Configuration confg = new Configuration();
    	confg.configure("com/soft/cnfg/hibernate.cfg.xml");
    	
    	SessionFactory factory = confg.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Product prod = new Product();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Product Name: ");
    	String name = sc.nextLine();
    	
    	System.out.println("Enter the Company Name: ");
    	String cname = sc.nextLine();

    	System.out.println("Enter Prize: ");
    	float prize = sc.nextFloat();
    	
    	
    	
    	prod.setProductName(name);
    	prod.setCompanyName(cname);
    	prod.setPrize(prize);
    	
    	
    	
    	Transaction tx = session.beginTransaction();
    	session.persist(prod);
    	
    	tx.commit();
    	
    	session.close();
    	factory.close();
    	
    	System.out.println("Product added successfully");
    	
    	
    }
}
