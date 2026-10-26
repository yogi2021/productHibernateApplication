package com.soft;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Product;

public class ProductUpdate {
        public void UpdateProduct() {
        	
        	Configuration confg = new Configuration();
        	confg.configure("com/soft/cnfg/hibernate.cfg.xml");
        	
        	SessionFactory factory = confg.buildSessionFactory();
        	Session session = factory.openSession();
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter product ID to Update: ");
        	
        	int id = sc.nextInt();
        	sc.nextLine();
        	
        	Product product = session.get(Product.class, id);
        	
        	if(product != null) {
        		
        	System.out.println("Enter New Product Name: ");
        	String name = sc.nextLine();
        	
        	System.out.println("Enter New Company Name: ");
        	String company = sc.nextLine();
        	
        	System.out.println("Enter New Price: ");
        	float price = sc.nextFloat();
        	
	Transaction tx = session.beginTransaction();
        	
        	product.setProductName(name);
        	product.setCompanyName(company);
        	product.setPrize(price);
        	
        	tx.commit();
        	
        	System.out.println("Product Updated..");
        	
        }else {
        	System.out.println("Product Not Found..");
        }
        	
        
}
        }
