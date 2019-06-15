package com.core.lambdaex;

public class MyStringOps2 {

	String result;
	
	MyStringOps2(){
		result = "";
	}

	MyStringOps2(String str) {
		this.result = str;
	}

	String strReverseOne(String str) {
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}
