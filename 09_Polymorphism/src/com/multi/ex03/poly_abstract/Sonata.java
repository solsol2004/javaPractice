package com.multi.ex03.poly_abstract;

public class Sonata extends Car {

	public Sonata() {
		super(2000); // 2000cc
	}

	@Override
	public void oilling() {
		System.out.println("휘발유를 주유중입니다.");
	}
	
	@Override
	public void move() {
		System.out.println("소나타가 부르르르르릉!");
	}
	
	public void sonataNickName() {
		System.out.println("소가 타는 차");
	}
}
