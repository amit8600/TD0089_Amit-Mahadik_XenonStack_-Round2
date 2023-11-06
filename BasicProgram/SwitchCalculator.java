package com.BasicProgram;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to create simple calculator using switch Statement
		double num1,num2,result;
		char operator;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1=input.nextDouble();
		
		System.out.println("Enter operator (+,-,*,/):");
		operator=input.next().charAt(0);
		
		System.out.println("Enter num2");
		num2=input.nextDouble();
		
		switch (operator) {
		
		case ('+'):
		result=num1+num2;
		System.out.println("Result=" +result);
		break;
		
		case ('-'):
			result=num1-num2;
			System.out.println("Result=" +result);
			break;
			
		case ('*'):
			result=num1*num2;
			System.out.println("Result=" +result);
			break;
			
		case ('/'):
			
			if(num2!=0) {
			result=num1/num2;
			System.out.println("Result=" +result);
			
		}
			else {
				System.out.println("Division by zero is invalid");
				break;
		}
		default:
			System.out.println("Please enter valid operator");
		}
			

	}

}
