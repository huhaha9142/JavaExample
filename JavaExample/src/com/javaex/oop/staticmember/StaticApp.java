package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {				// 1. Static Block 불이 들어오고 -> Instance created! (생성자)
		StaticEx s1 = new StaticEx();		//	인스턴스 생성					// 2. 참조 카운트 : 1
		System.out.println("참조 카운트: " + StaticEx.refCount);	
		//	Static 멤버는 new로 인스턴스를 생성하지 않아도 접근 가능
		
		StaticEx s2 = new StaticEx();								//	3. Instatnce created 생성자만 호출
		System.out.println("참조 카운트: " + s2.refCount);			// s2 인스턴스
		
		// 객체가 제거
		s1 = null;	//	참조를 해제
		System.out.println("s1 해제");
		System.out.println("참조 카운트: " + StaticEx.refCount);
		
		System.gc();  // 가비지 콜렉터 수행
		try {
				// 잠시 대기
				Thread.sleep(3000);
				System.out.println("참조 카운트: " + StaticEx.refCount);
		}	catch (Exception e) {
			
		}
		

	}

}
