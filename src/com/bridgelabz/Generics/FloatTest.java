package com.bridgelabz.Generics;

public class FloatTest {

public static float max(float num1 , float num2, float num3) {
		
		 Float maxi;
		
		if(num1>num2 && num1>num3) {
			maxi = num1;
			return maxi;
		}
		
		if(num2>num1 && num2>num3) {
			maxi = num2;
			return maxi;
		}
		else {
			maxi = num3;
		}
		return maxi;
	} 
}
