package com.BasicProgram;
import java.util.Scanner;

public class BasicMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner (System.in);
		
		int a, b, sum,sub,multi,div;
	
		System.out.println("Enter First Number");
		
		a=scanner.nextInt();
		
		System.out.println("Enter Second Number");
		
		b=scanner.nextInt();
		
		scanner.close();
		
		sum= a+b;
		sub=a-b;
		multi=a*b;
		div=a/b;
		
		
		System.out.println("Addition of these two numbers is" +sum);
		System.out.println("Substraction of these two numbers is" +sub);
		System.out.println("Multiplication of these two numbers is" +multi);
		System.out.println("Division of these two numbers is" +div);
		
	
	}

}
