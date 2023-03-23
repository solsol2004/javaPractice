package com.multi.ex03.poly_abstract;

public abstract class HyundaiCar extends Car{
		//abstract 클래스 특징
		//1. new로 생성되지 않는다.
		//2. abstract로 메소드를 가질 수 있다.
		//3. 일반 메소드나 멤버 변수 선언도 자유롭다.
	
		//활용 방법: 주로 부모클래스 상속이 되거나 Type으로 활용된다.
	
	//추상 클래스도 일반 멤버 변수를 가질 수 있다.
	public String serviceName ="블루핸즈";
	
	
	public HyundaiCar(int cc) {
		super(cc);
	}
	
	//추상메소드 : 몸통을 가지지 않는다. 그리고 상속받은 Class(자식)에서 강제로 생성해야 한다.
	abstract public void nickName();
	
	//일반메소드 : 공통적인 기능을 구현할때 일반 메소드로 구현한다.
	public void service() { // 블루핸즈로 간다
		System.out.println(serviceName + "으로 출발합니다.");
	}
	
}
