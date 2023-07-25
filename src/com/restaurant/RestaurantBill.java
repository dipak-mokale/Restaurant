package com.restaurant;

import java.util.Scanner;

public class RestaurantBill {
	Scanner scanner = new Scanner(System.in);
	
    String customerName;
	long customerMobile;
	int totalQuantity;
	double totalBill;
	int quantity;
	int amount;
	String foodItem;
	double GST ;
	double SGST ;
	double finalValue ;
	
	void getCustomerDetails() {
		System.out.println("Enter customer name : ");
		customerName = scanner.next();
		System.out.println("Enter customer Mobile : ");
		customerMobile = scanner.nextLong();
		getMenu();
	}
	
	void getMenu() {
		System.out.println("Please select an order ");
		System.out.println(" 1. Poha \t 20 rs \n 2. Samosa \t 20 rs \n 3. Dhokla \t 15 rs \n 4. Pulao \t 10 rs \n 5. Chai \t 8 rs");
		int ch = scanner.nextInt();
		getOrder(ch);
	}
	
	void getOrder(int choice) {
		
		switch (choice) {
		case 1:
			System.out.println("You selected Poha");
			foodItem = "Poha";
			System.out.println("Please enter quantity");
			quantity = scanner.nextInt();
			amount = 20*quantity;
			totalBill += amount;
			totalQuantity += quantity;
			GST = (0.05 * totalBill);
			SGST = GST / 2;
			finalValue = totalBill + GST;
			break;
			
		case 2:
			System.out.println("You selected Samosa");
			foodItem = "Samosa";
			System.out.println("Please enter quantity");
			quantity = scanner.nextInt();
			amount = 20*quantity;
			totalBill += amount;
			totalQuantity += quantity;
			GST = (0.05 * totalBill);
			SGST = GST / 2;
			finalValue = totalBill + GST;
			break;
		case 3:
			System.out.println("You selected Dhokla");
			foodItem = "Dhokla";
			System.out.println("Please enter quantity");
			quantity = scanner.nextInt();
			amount = 15*quantity;
			totalBill += amount;
			totalQuantity += quantity;
			GST = (0.05 * totalBill);
			SGST = GST / 2;
			finalValue = totalBill + GST;
			break;
		case 4:
			System.out.println("You selected Pulao");
			foodItem = "Pulao";
			System.out.println("Please enter quantity");
			quantity = scanner.nextInt();
			amount = 10*quantity;
			totalBill += amount;
			totalQuantity += quantity;
			GST = (0.05 * totalBill);
			SGST = GST / 2;
			finalValue = totalBill + GST;
			break;
		case 5:
			System.out.println("You selected Chai");
			foodItem = "Chai";
			System.out.println("Please enter quantity");
			quantity = scanner.nextInt();
			amount = 8*quantity;
			totalBill += amount;
			totalQuantity += quantity;
			GST = (0.05 * totalBill);
			SGST = GST / 2;
			finalValue = totalBill + GST;
			break;

		default:
			System.out.println("Invalid option . Select Agian ! ");
			getMenu();
			break;
		}
		orderMore();
			
	}
	
	void orderMore() {
		System.out.println("Would like to order more ? 1.for YESS \t 2. for NO");
		int orderAgain = scanner.nextInt();
		if (orderAgain==1) {
			getMenu();
		}else if (orderAgain>2) {
			System.out.println("Select 1 for yess or 2 for no ");
			orderMore();
		}
	}
}
	
	


