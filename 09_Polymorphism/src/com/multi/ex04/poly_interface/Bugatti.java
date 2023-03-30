package com.multi.ex04.poly_interface;

// 외제차 - 프랑스
public class Bugatti extends Car implements OverseasType{
	public Bugatti() {
		super(8000);
	}
	
	@Override
	public void oilling() {
		System.out.println("고급 휘발유를 주유중입니다.");
	}
	
	@Override
	public void move() {
		System.out.println("부오아엉오아아아오아아앙앙(최대한 시끄럽게)");
	}
	
	public void nickName() {
		System.out.println("명진님의 드림카");
	}

	@Override
	public void origin() {
		System.out.println("Made in france");
	}	
}
