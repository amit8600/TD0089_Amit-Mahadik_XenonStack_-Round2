package com.BasicProgram;
import java.util.Scanner;

public class AreaCalculation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Press one to start the program");
		
		int area,perimeter;
		Scanner sc = new Scanner (System.in);
		area= sc.nextInt();
		
		switch (area) {
		case 1:
		System.out.println("Press 1 to calculate Area");
		break;
		}
		Scanner sc1 = new Scanner (System.in);
		perimeter= sc1.nextInt();
		switch (perimeter) {
		case 1:
				System.out.println("Press 2 to calculate perimeter");
				break;
	//	case 2:
	//		System.out.println("Press 2 to calculate perimeter");
	//		break;
			
		}
		
		
		
		Scanner sc2 = new Scanner (System.in);
		perimeter= sc2.nextInt();
		switch (perimeter) {
		case 1:
			System.out.println("Press 2 to calculate perimeter");
			break;
		
		}
		
		int base,height,area1;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter base of triangle");
		base=input.nextInt();
		
		System.out.println("Enter height of the Triangle");
		height=input.nextInt();
		
		input.close();
		
		
		area=(int) (((0.5))*base*height);
		System.out.println("Area of Triangle is" +area);
		


	}

}
