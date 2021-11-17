package com.bridgelabz.Generics;

public class MaximumFind {

	public Integer maximum(int num1 , int num2, int num3) {
		
		Integer max;
		
		if(num1>num2 && num1>num3) {
			max = num1;
			return max;
		}
		
		if(num2>num1 && num2>num3) {
			max = num2;
			return max;
		}
		else {
			max = num3;
		}
		return max;
	} 
}
