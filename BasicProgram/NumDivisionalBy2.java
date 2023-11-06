package com.BasicProgram;

public class NumDivisionalBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write a program to print numbers till 100 which are divisible by 4
		
		int num;
		
		for (num =0; num<=100; num++) {
			
			if (num%4==0) {
				System.out.println(+num+ "is divisible by 4");
			}
			else {
				System.out.println(+num+"Number is not divisible by 4");
			
			}
		}
		
		

	}

}
