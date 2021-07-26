package com.javaex.quiz2;

public class Quiz02_1 {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		
		char c = 'A';
		
		String result;
		result = a % 2 == 0 ? "true": "false";
		System.out.println(a + "는 " + result);
		
		result = b % 3 == 0 ? "true": "false";
		System.out.println(b + "는 " + result);
		
		boolean r1 = (a % 2 ==0) && ( b % 3 == 0) ;
		System.out.println(r1);
		
		
		
	}
	
}
