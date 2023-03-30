package com.multi.ex04.poly_interface;

// 부모 클래스
public abstract class Car {
	protected int cc = 0; // 배기량
	
	// 인자 있는 생성자
	public Car(int cc) {
		this.cc = cc;
	}
	
	public void oilling() {
		System.out.println("주유중 입니다.");
	}
	
	public void move() {
		System.out.println("부릉부릉");
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "Name : " + this.getClass().getSimpleName();
		str += ", cc : " + cc;
		return str;
	}

}
