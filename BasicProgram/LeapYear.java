package com.BasicProgram;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year 
like 2000, 1900, 2100 then it must be divisible by 400.*/
		
		int year;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enetr any year of your choice");
			year=input.nextInt();
		}
		if((year%4==0 && year%100!=0) || (year%100==0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}

	}

}
