package com.BasicProgram;
import java.util.Scanner;
public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		Ask user for their salary and year of service and print the net bonus amount.*/
		
		int salary, Service;
		double bonus=0.5;
		
		System.out.println("Please Enter your salary");
		Scanner input= new Scanner(System.in);
		salary=input.nextInt();
		
		System.out.println("Please Enter years of service in company");
		Service=input.nextInt();
	
		
		if (Service>5) {
			salary+=bonus*salary;
			System.out.println("Congratulations!!! Enjoy your net salary with bonus" +salary);
			
		}
		else if (Service<5) {
			Service=5-Service;
			System.out.println("Sorry!!! your service in company is " +Service+ " years.Not eligible for bonus");
		}
		
		

	}

}
