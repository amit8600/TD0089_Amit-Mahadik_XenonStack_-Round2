package com.BasicProgram;
import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to read a weekday number and print weekday name using switch statement
		int day;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice from 1-7");
		day=input.nextInt();
			
		
		switch (day) {
			case 1:
				System.out.println("Day 1, Moday");
				break;
				
			case 2:
				System.out.println("Day2, Tuesday");
				break;
				
			case 3:
				System.out.println("Day3, Wednesday");
				break;
				
			case 4:
				System.out.println("Day4, Thursday");
				break;
				
			case 5:
				System.out.println("Day5, Friday");
				break;
				
			case 6:
				System.out.println("Day6, Saturday");
				break;
				
			case 7:
				System.out.println("Day 7, Sunday");
				break;
				
			case 8:
				System.out.println("Plase enter valid choice");
				break;
				default:
		
		}
		
			
		

	}

}
