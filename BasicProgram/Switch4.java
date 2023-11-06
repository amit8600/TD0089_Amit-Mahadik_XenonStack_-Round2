package com.BasicProgram;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to Find the number of days in a month using a switch statement
		Scanner input = new Scanner(System.in);
		int month = 0;
		int days;
		System.out.printf("Enter the Month Number : ");
		month = input.nextInt();
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31..");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30..");
				break;
			case 2:
				days = 28;
				break;
			default:
				System.out.printf("Invalid...Please Enter the 1 to 12...");
				break;
		}		
	}


	}


