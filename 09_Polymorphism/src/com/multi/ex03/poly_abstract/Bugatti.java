package com.multi.ex03.poly_abstract;

public class Bugatti extends HyundaiCar{

	public Bugatti() {
		super(8000); // 8000cc
	}

	@Override
	public void oilling() {
		System.out.println("고급 휘발유를 주유중입니다");
	}
	
	@Override
	public void move() {
		System.out.println("부와와오아와와오아앙");
	}
	

	@Override
	public void nickName() {
		System.out.println("드림카");
		
	}
}
