package com.bridgelabz.Generics;

public class StringTest {

	public String max(String s1, String s2, String s3) {

		String max;

		if (s1.length() > s2.length() && s1.length() > s3.length()) {
			max = s1;
			return max;
		}

		if (s2.length() > s1.length() && s2.length() > s3.length()) {
			max = s2;
			return max;
		} else {
			max = s3;
		}
		return max;
	}
}
