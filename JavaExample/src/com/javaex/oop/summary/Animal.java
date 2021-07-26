package com.javaex.oop.summary;

public abstract class Animal {
	//	필드
	protected String name;		// protected : 접근제한자
	protected int age;			// private < default(자신,동일패키지) < protected(자신,동일패키지,상속받은 클래스)< public(완전공개)
	
	public Animal(String name) {
		super();
		this.name = name;
		
	}
	
	public Animal(String name, int age) {
		//	자신의 다른생성자 호출
		this(name);	// 8번줄 animal 호출
		this.age = age;
		
		
	}
	
	//	메서드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
		
	}
	
	//	추상 메서드 : 메서드를 선언만 한다.
	//	자식 클래스에서 Override 해야한다.
	public abstract void say();
	
	
	
}
