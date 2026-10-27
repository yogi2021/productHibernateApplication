package com.soft;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Product;

public class HQL_GetProductonName {
  public static void main(String[] args) {
	Configuration cnfg = new Configuration();
	cnfg.configure("/com/soft/cnfg/hibernate.cfg.xml");
	SessionFactory factory = cnfg.buildSessionFactory();
	Session session = factory.openSession();
	
	Product prod = session.createSelectionQuery("from Product where productName=:name",
			Product.class).setParameter("name", "computer").getSingleResult();
	System.out.println(prod);
	
	List<Product> plist= session.createSelectionQuery("FROM Product WHERE companyName =: cname",
			Product.class).setParameter("cname", "Lenskart").getResultList();
	
	
	System.out.println(plist);
   }
}

