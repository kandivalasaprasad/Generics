package com.bridgelabz.Generics;

import java.util.Scanner;

public class MaxString {
	
	public static String s1;
	public static String s2;
	public static String s3;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringTest StringMax = new StringTest();
		System.out.println("welcome to find maximum Number");
		System.out.println("Enter first String:");
		s1 = sc.next();
		System.out.println("Enter second String:");
		s2 = sc.next();
		System.out.println("Enter third String:");
		s3 = sc.next();
		System.out.printf("maximum String is:");
		System.out.println(StringMax.max(s1, s2, s3));

	}
}
