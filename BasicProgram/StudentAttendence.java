package com.BasicProgram;
import java.util.Scanner;
public class StudentAttendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
		Take following input from user
		Number of classes held
		Number of classes attended.
		And print
		percentage of class attended
		Is student is allowed to sit in exam or not.*/
		
		int classesHeld, classesAttended;
		double percentage;
		
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number of classes held");
			classesHeld=input.nextInt();
			
			System.out.println("Enter number of classe attended");
			classesAttended=input.nextInt();
			input.close();
		}
		percentage=(double) classesAttended/classesHeld*100;
		System.out.println("Percentage of class attended is" +percentage);
		
		if (percentage>=75) {
			System.out.println("You are eligible to sit for an exam");
		}
		 {
			System.out.println("You are not eligible");
		}
		

	}

}
