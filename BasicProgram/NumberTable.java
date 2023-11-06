package com.BasicProgram;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int table;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter num of your choice");
		num=input.nextInt();
		System.out.println("Table of your num is ");
		for (int i=1; i<=10; i++) {
			table=num*i;
			System.out.println(+table);
		}
		
		

	}

}
