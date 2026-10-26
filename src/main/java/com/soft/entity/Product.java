package com.soft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_db")
public class Product {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int productId;
  private String productName;
  private String companyName;
  private float prize;
  public int getProductId() {
	return productId;
  }
  public void setProductId(int productId) {
	this.productId = productId;
  }
  public String getProductName() {
	return productName;
  }
  public void setProductName(String productName) {
	this.productName = productName;
  }
  public String getCompanyName() {
	return companyName;
  }
  public void setCompanyName(String companyName) {
	this.companyName = companyName;
  }
  public float getPrize() {
	return prize;
  }
  public void setPrize(float prize) {
	this.prize = prize;
  }
  
  
}
