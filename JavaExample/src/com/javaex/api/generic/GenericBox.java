package com.javaex.api.generic;

//	Generic 이용
//	T -> Type
public class GenericBox<T> {	//	<T> 는 미정
	T content;	//	타입을 미정 상태

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
	

}
