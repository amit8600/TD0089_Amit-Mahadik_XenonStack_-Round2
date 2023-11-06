package com.BasicProgram;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take 10 integer inputs from user and store them in an array and print them on screen.
		

		Scanner input =new Scanner (System.in);
			
		
		int []arr=new int[10];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Print the value of array" +i);
			arr[i]=input.nextInt();
		}
		
		
		

	}

}
