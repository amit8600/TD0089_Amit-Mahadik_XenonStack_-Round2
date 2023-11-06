package com.BasicProgram;

public class MultiplicationTable {

	  public static void main(String[] args) {
		    int n = Integer.parseInt(System.console().readLine());
		    for (int i = 1; i <= n; i++) {
		      System.out.println(n + " * " + i + " = " + (n * i));
		    }
		  }
		}