package com.multi.ex03.poly_abstract;

public class Grandeur extends Car {

	public Grandeur() {
		super(3000); // 3000cc
	}

	@Override
	public void oilling() {
		System.out.println("휘발유를 주유중입니다.");
	}
	
	@Override
	public void move() {
		System.out.println("(조용히)부르르르르릉");
	}
	
	public void gradeurNickName() {
		System.out.println("각그랜저");
	}
}
