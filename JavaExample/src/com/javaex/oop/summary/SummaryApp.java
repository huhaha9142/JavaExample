package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 48);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("포", 15);
		
		
		h1.eat(); // Animal 클래스에 있는 일반 메서드
		h1.say(); // Animal 추상메서드 -> 자식클래스에서 Override해서 구현
		fight(h1); //	홍길동 Human
		fly(h1);
		
		p1.eat();
		p1.say();
		fight(p1);	//	Panda
		fly(p1);
		
		h2.eat();
		h2.say();
		fight(h2);	//	 네오	 TheOne Implements KungfuSkill
		fly(h2);
		
		p2.eat();
		p2.say();
		fight(p2);	//	KungfuPanda		implements KungfuSkill
		fly(p2);
		
	}
	
	private static void fly(Animal actor) {
		// actor가 Flyable 인터페이스를 구현?
		if (actor instanceof Flyable) {
			// Flyable로 캐스팅 가능
			((Flyable)actor).fly();
		} else {
			//	캐스팅 불가
			System.out.printf("%s: 하늘을 날 수 없어요.", actor.name);
		}
	}
	
	private static void fight(Animal actor) {
		//	actor가 KungfuSkill 인터페이스를 구현?
		if (actor instanceof KungfuSkill) {
			//	KungfuSkill로 다운캐스팅 가능
			((KungfuSkill)actor).kungfu();
			
		} else {
			// 캐스팅 불가
			System.out.printf("%s: 쿵푸 못해요~%n", actor.name);
				
		}
		
	}

}
