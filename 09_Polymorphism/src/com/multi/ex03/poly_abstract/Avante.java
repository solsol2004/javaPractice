package com.multi.ex03.poly_abstract;

public class Avante extends Car {

	public Avante() {
		super(1600); // 아반떼는 1600cc이다.
	}
	
	@Override // 오버라이드된 메소드
	public void oilling() {
		System.out.println("휘발유를 주유중입니다.");
	}

	//Avante 고유의 메소드
	public void avanteNickName() {
		System.out.println("아방이");
	}
}
