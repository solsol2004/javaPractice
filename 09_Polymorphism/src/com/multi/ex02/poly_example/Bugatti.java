package com.multi.ex02.poly_example;

public class Bugatti extends Car{

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
	
	public void bugattiNickName() {
		System.out.println("드림카");
	}
}
