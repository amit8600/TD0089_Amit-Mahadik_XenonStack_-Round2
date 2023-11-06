package com.BasicProgram;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any number of your choice");
		num=scanner.nextInt();
		
		if (num%2==0){
		
		System.out.println(num+ "Even Number");
		}
		
		else {
			
		System.out.println(num+ "Odd number");
		}
		 
	}

}
