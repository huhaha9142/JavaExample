package com.javaex.problem03;

public class AccontApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int money;
		
		Account account = new Account("321-89562-123456");
		System.out.printf("%s 계좌가 개설되었습니다%n", account.getAccountNo());
		while(run) {
			System.out.println("");
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 |4. 종료");
			
		}
		

	}

}
