package com.BasicProgram;
import java.util.Scanner;
public class Opperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take two int values from user and print greatest among them.
		int Fvalue, Svalue;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter first value");
		Fvalue=scanner.nextInt();
		
		System.out.println("Enter second value");
		Svalue=scanner.nextInt();
		
		scanner.close();
		
		if (Fvalue > Svalue) {
			System.out.println("First value is greater");
		}
		else {System.out.println("Second value is greater");
		
		}
		
		

	}

}
