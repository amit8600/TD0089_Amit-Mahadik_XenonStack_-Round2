package com.BasicProgram;
import java.util.Scanner;

public class CostExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity
		Suppose, one unit will cost 100.
		Judge and print total cost for user.*/
		
		int item=100,quantity,cost,FinalCost;
		double discount=0.10;
		
		System.out.println("enter Quantity");
		try (Scanner input = new Scanner(System.in)) {
			quantity=input.nextInt();
			
		}
		cost=(quantity*item);
		 FinalCost=cost;
	
		 
		if (cost>=1000) {
			FinalCost-=cost*discount;
			System.out.println("10% discount is applied and total bill is " +FinalCost);
		}
		else {
			System.out.println("Sorry!!! You are not eligible for 10% discount and Your bill amount is" +cost);
			
		}

	}

}
