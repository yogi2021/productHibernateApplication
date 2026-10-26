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
			ProductAdd productAdd = new ProductAdd();
			productAdd.AddProduct();
			break;
			
		case 2:
			ProductRead productRead = new ProductRead();
			productRead.ReadProduct();
		break;
			
		case 3:
			ProductDelete productDelete = new ProductDelete();
			productDelete.DeleteProduct();
			break;
			
		case 4:
			ProductUpdate productUpdate = new ProductUpdate();
			productUpdate.UpdateProduct();
			break;
			
		case 5:
		System.out.println("Thanks for visiting the Product Application");
			
 	break;
			
		default:
			System.out.println("Enter Correct Choice..");
		}
				  	
	}
	
}
}
