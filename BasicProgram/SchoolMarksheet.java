package com.BasicProgram;
import java.util.Scanner;
public class SchoolMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A school has following rules for grading system:
			a. Below 25 - F
			b. 25 to 45 - E
			c. 45 to 50 - D
			d. 50 to 60 - C
			e. 60 to 80 - B
			f. Above 80 - A
			Ask user to enter marks and print the corresponding grade.*/
		
		int marks;
				
		System.out.println("Hello!!! Enter your Marks");
		try (Scanner input = new Scanner(System.in)) {
			marks=input.nextInt();
		}
		if(marks<=25) {
			System.out.println("You got 'F' Grade");
		}
		else if (marks>25&&marks<45) {
			System.out.println("\"You got 'E' Grade\"");
		}
		else if (marks>45&&marks<50) {
			System.out.println("\"You got 'D' Grade\"");
		}
		else if (marks>50&&marks<60) {
			System.out.println("\"You got 'C' Grade\"");
		}
		else if (marks>60&&marks<80) {
			System.out.println("\"You got 'B' Grade\"");
		}
		else if (marks>80&&marks<=100) {
			System.out.println("\"You got 'A' Grade\"");
		
		}
		else {
			System.out.println("Invalid Marks!!!");
		}
	}

}
