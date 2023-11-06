package com.BasicProgram;
import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print absolute vlaue of a number entered by user.
		
		int num;
		
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number of your choice");
			num=input.nextInt();
		}
		int absoluteValue1=Math.abs(num);
		
	    	System.out.println("Absolute value of your number is " +absoluteValue1);
	    }

	}


