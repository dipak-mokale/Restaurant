package com.restaurant;

import java.sql.Date;
import java.time.LocalDateTime;

public class Bill {
//	RestaurantBill rb = new RestaurantBill();
	
	
	void printBill() {
		RestaurantBill rb = new RestaurantBill();
		
		rb.getCustomerDetails();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("     UpSouth Waakad\n      HK Ventures\n   Bliss Society, Near Datta Mandir\n    Wakad - Thergaon Road, Wakad\n     PCMC, Pune :- 411057");
		System.out.println("------------------------------------------------------");
		System.out.println("Type : Dine In");
		System.out.println("------------------------------------------------------");
		System.out.println("Bill No : "+(int)(Math.random()*100000));
		System.out.println("Delivery Boy : ");
		System.out.println("Date : "+(LocalDateTime.now()));
		System.out.println("Kots : "+(int)(Math.random()*100));
		System.out.println("------------------------------------------------------");
		System.out.println("Customer Details ");
		System.out.println("====================================");
		System.out.println("Customer Name : "+rb.customerName);
		System.out.println("Mobile : "+rb.customerMobile);
		System.out.println("------------------------------------------------------");
		System.out.println("Item \t Qty \t Amt");
		System.out.println("------------------------------------------------------");
		System.out.println(rb.foodItem+"\t"+rb.quantity+"\t"+rb.amount);
		System.out.println("------------------------------------------------------");
		System.out.println("Total Qty Ordered : \t" +rb.totalQuantity);
		System.out.println("Total Bill : \t \t"+rb.totalBill);
		System.out.println("------------------------------------------------------");
		System.out.println("GST  @5%"+"\t"+String.format("%.2f", rb.GST));
		System.out.println("\t SGST \t"+String.format("%.2f", rb.SGST));
		System.out.println("\t SGST \t"+String.format("%.2f", rb.SGST));
		System.out.println("------------------------------------------------------");
		System.out.println("Total Invoice Value : \t"+ (rb.finalValue));
		System.out.println("Rounded off to final Total : \t"+ Math.round(rb.finalValue));
		System.out.println("------------------------------------------------------");
		System.out.println("\t GST No : HGFY58GT58658FDRW");
		System.out.println("\t CIN : U55255KJUH485652KMNHWEDOU");
		System.out.println("\t FASSAI : 125458659653254");
		System.out.println("\t Thnak You, Visit Again ! ");
	}
	
	
	
	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.printBill();
		
	}

}
