package com.BasicProgram;
import java.util.Scanner;
public class EmployeeSyst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/
		
		int age;
		char maritalStat;
		char sex;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your age");
		age=input.nextInt();
		
		System.out.println("Enetr marital status");
		maritalStat=input.next().charAt(0);
		
		System.out.println("Enter your gender");
		sex=input.next().charAt(0);
		
		input.close();
		
		if (sex=='F') {
			System.out.println("Ladies only allowed to work in urban area");
		}
		else if (sex=='M' && age>=20 && age<=40) {
			System.out.println("Employee may work anyehere");
	}
		else if (sex=='M' && age>40 && age<=60) {
			System.out.println("Employee work in urban areas only");
		}
		else {
			System.out.println("Enter valid age");
		}
	
	}

}
