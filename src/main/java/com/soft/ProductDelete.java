package com.soft;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Product;

public class ProductDelete {
      public void DeleteProduct() {
    	  
    	  Configuration confg = new Configuration();
    	  confg.configure("com/soft/cnfg/hibernate.cfg.xml");
    	  
    	  SessionFactory factory = confg.buildSessionFactory();
    	  Session session = factory.openSession();
    	  
    	  Product prod = new Product();
    	  
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter Product ID to Delete: ");
    	  int id = sc.nextInt();
    	  
    	  Product product = session.get(Product.class, id);
    	  
    	  if(product != null) {
    		  Transaction tx = session.beginTransaction(); 
    		  session.remove(product);
    		  tx.commit();
    		  System.out.println("Product Deleted..");
    	  }else {
    		  System.out.println("Product Not Found");
    	  }
    	  
    	 
    	  
    	  
    
    	  session.close();
    	  factory.close();
    	  
      }
}
