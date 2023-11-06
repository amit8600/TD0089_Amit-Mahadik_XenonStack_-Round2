package com.BasicProgram;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take values of length and breadth of a rectangle from user and check if it is square or not.
		int length,breadth;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Press 1 to enter length");
			length=input.nextInt();
			System.out.println("Press 2 to enter breadth");
			breadth=input.nextInt();
			input.close();
		}
	//	area=length*breadth;
		
		if (length==breadth) {
			System.out.println("It is square");
		}
		else {
			System.out.println("Not a square");
		}
		
	

	}

}
