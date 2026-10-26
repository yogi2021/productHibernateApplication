package com.soft;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	
	while(choice != 5) {
		System.out.println("Welcome to Product Application..");
		System.out.println("-------------------");
		System.out.println("1. Create new Product");
		System.out.println("2. Read Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Update Product");
		System.out.println("5. Exit");
		
		System.out.println("Enter Your Choice: ");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			ProductAdd ProductAdd = new ProductAdd();
			ProductAdd.AddProduct();
			break;
			
		case 2:
			ProductRead ProductRead = new ProductRead();
			ProductRead.ReadProduct();
			break;
			
		case 3:
			ProductDelete ProductDelete = new ProductDelete();
			ProductDelete.DeleteProduct();
			break;
			
		case 4:
			ProductUpdate ProductUpdate = new ProductUpdate();
			ProductUpdate.UpdateProduct();
			break;
			
		case 5:
			System.out.println("Thanks for visiting the Product Application");
			isvalue=false;
			break;
			
		default:
			System.out.println("Enter Correct Choice..");
		}
				  	
	}
	
}
}
