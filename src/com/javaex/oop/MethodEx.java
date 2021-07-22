package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printMessage();
		printMessage("Hello, Method");
		
	}
	
	//	입력 o, 출력 x
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없어요!" );
			return; //	돌아가세요!
		}
		System.out.println(num1 / num2);
		
	}
 	//	입력 o, 출력 x
	private static void printMessage(String message) {
		System.out.println(message);
		
	}
	
	// 입력 x, 출력 x
	private static void printMessage()
	{
		System.out.println("Hello,OOP");
		
	}
}
