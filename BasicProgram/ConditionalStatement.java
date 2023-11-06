package com.BasicProgram;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a day of your choice");
		day=input.next();
		input.close();
		
		
		
		if (day.equals("Sunday")) {
			System.out.println("Holiday of the week!");
		}
		else {
			System.out.println("Its a working day!");
			
		}
		

	}

}
