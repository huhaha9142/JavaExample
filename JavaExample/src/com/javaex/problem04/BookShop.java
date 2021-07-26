package com.javaex.problem04;

public class BookShop {

	public static void main(String[] args) {
		
	}

	
	
	
	// (2) 전달받은 배열을 모두 출력하는 메소드
	private static void displayBookInfo(Book[] books) {
		for (Book book: books) {
			book.print();
		}
	}
}
