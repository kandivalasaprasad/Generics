package com.bridgelabz.Generics;

import java.util.Scanner;

public class MaxFloat {

	public static float num1;
	public static float num2;
	public static float num3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FloatTest  FloatMax = new FloatTest();
		System.out.println("welcome to find maximum Number");
		System.out.println("Enter first Number:");
		num1 = sc.nextFloat();
		System.out.println("Enter second Number:");
		num2 = sc.nextFloat();
		System.out.println("Enter third Number:");
		num3 = sc.nextFloat();
		System.out.printf("maximum Number  in %.2f,%.2f,%.2f :", num1,num2,num3); 
				System.out.println( FloatTest.max(num1, num2, num3) );

	}
}
