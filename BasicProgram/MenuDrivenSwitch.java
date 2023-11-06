package com.BasicProgram;

import java.util.Scanner;

public class MenuDrivenSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to Menu driven program using switch statement ( Find addition, 
	//	subtraction, multiplication and division of to integer numbers )
		
		int choice, num1,num2,result;
		
		System.out.println("Press 1 for add");
		System.out.println("Prss 2 for sub");
		System.out.println("Press 3 for mul");
		System.out.println("Press 4 for div");
		
		Scanner input =new Scanner(System.in);
		choice=input.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("Enter num1");
			num1=input.nextInt();
			
			System.out.println("Enter num2");
			num2=input.nextInt();
			
			result=num1+num2;
			System.out.println("Addition is " +result);
			break;
			
		case 2:
				
			System.out.println("Enter num1");
			num1=input.nextInt();
			
			System.out.println("Enter num2");
			num2=input.nextInt();
			
			result=num1-num2;
			System.out.println("Subtraction is " +result);
			break;
			
		case 3:
		
			System.out.println("Enter num1");
			num1=input.nextInt();
			
			System.out.println("Enter num2");
			num2=input.nextInt();
			
			result=num1*num2;
			System.out.println("mul is " +result);
			break;
			
		case 4:
			
			System.out.println("Enter num1");
			num1=input.nextInt();
			
			System.out.println("Enter num2");
			num2=input.nextInt();
			
			if(num2!=0) {			 			
			result=num1/num2;
			System.out.println("Div is " +result);
			break;
			}	
	
		default:
			System.out.println("Enter valid choice");
		}
}

}