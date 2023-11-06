package com.BasicProgram;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find the Maximum of Two Numbers using switch statement
		double num1,num2,maxNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=sc.nextDouble();
		
		System.out.println("Enter num2");
		num2=sc.nextDouble();
		
		maxNum=Math.max(num1, num2);
		System.out.println("Maximum num is " +maxNum);
		

	}

}
