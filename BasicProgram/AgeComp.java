package com.BasicProgram;
import java.util.Scanner;


public class AgeComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take input of age of 3 people by user and determine oldest and youngest among them.3
		
		int P1, P2, P3;
		
		try (Scanner age = new Scanner(System.in)) {
			System.out.println("Enter age of persons1");
			P1=age.nextInt();
			
			System.out.println("Enter age of persons2");
			P2=age.nextInt();
			
			System.out.println("Enter age of persons3");
			P3=age.nextInt();
			age.close();
		}
		if ((P1>P2) && (P1>P3)){
			System.out.println("P1 is the 'Oldest' person" );
		}
		else if ((P2>P1) && (P2>P3)) {
			System.out.println("P2 is the 'Oldest' person");
		}
		else if ((P3>P1) && (P3>P2)){
			System.out.println("P3 is the 'Oldest' person");
		}
		else { 
			System.out.println("Same age");
		}
		if ((P1<P2) && (P1<P3)) {
			System.out.println("P1 is 'Youngest' Person");
		}
		else if ((P2<P1) && (P2<P3)) {
			System.out.println("P2 is 'Youngest' Person");
		}
		else if ((P3<P1) && (P3<P2)) {
			System.out.println("P3 is 'Youngest' Person");
		}
				
	}

}
