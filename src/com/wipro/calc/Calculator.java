package com.wipro.calc;

import java.util.Scanner;
public class Calculator {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number one:");
		int numberOne=sc.nextInt();
		System.out.print("Enter the number two:");
		int numberTwo=sc.nextInt();
		int result=numberOne+numberTwo;
		System.out.println("Addition of Two Number:"+result);
		
		System.out.println("Hi");
	}
}
