package com.multi.ex04.overloading;

public class Overloading {
	// 메소드 오버로딩이란?
	// - 같은 메소드(함수) 명이면서 다른 타입의 인자를 받아들이고 같은 기능을 동작하게끔 설계할 때 사용
	
	// 메소드 오버로딩 규칙
	// 1. 메소드의 이름이 같아야한다.
	// 2. 매개변수의 갯수가 다르거나
	// 3. 매개변수의 Type(종류)가 다르거나
	// 4. 매개변수의 Type 순서가 다르거나
	// 5. 반환형은 무관하다. (return 을 하든 안하든 된다.)
	// 6. 변수명은 무관하다. (Type으로만 판단함!)

	
	void myMethod(int val) {
		System.out.println(val);
	}
	
//	Duplicate method myMethod(int) in type Overloading
//	int myMethod(int val) {
//		System.out.println(val);
//		return 1;
//	}
	
	//인자가 더 많거나
	int myMethod(int val1, int val2) {
		System.out.println(val1 + val2);
		return val1 + val2;
	}
	
	//Type이 다르거나
	void myMethod(String val) {
		System.out.println(val);
	}
	
	
	public static void main(String[] args) {
		// 대표적인 오버로딩 함수 : System.out.println();
		System.out.println(12); //int
		System.out.println(3.12); //double
		System.out.println(true); //boolean
		System.out.println('a'); //char
		System.out.println("안녕?"); //String
	
		// 만일 오버 로딩이 문법적으로 적용되지 않으면?
		// 메소드 이름을 분리해야 함 --> C, C++ 에서는 아래 방법으로 오버로딩을 대처함
//		System.out.printlnI(12); //int
//		System.out.printlnD(3.12); //double
//		System.out.printlnB(true); //boolean
//		System.out.printlnC('a'); //char
//		System.out.printlnS("안녕?"); //String
	
		Overloading test = new Overloading();
		test.myMethod(12);
		test.myMethod("안녕하세요?");
		test.myMethod(12, 14);
		
	}
	
	

	// 오버로딩 설계 방법
	// 1. 인자가 가장 많은 메소드로 기능 구현을 한다.
	// 2. 적은 인자의 메소드를 오버로딩으로 구현하고, 인자가 가장 많은 메소드를 호출
	// 설계 이유: 편리성, 인자가 적게 들어와도 문제 없다는 것을 알리기 위한 설계
	public void print(String a, String b, String c) {
		System.out.println(a + b + c);
	}

	public void print(String a, String b) {
		print(a,b,"");// 인자가 가장 많은 메소드를 재사용한다!
	}

	public void print(String a) {
		print(a,"","");// 인자가 가장 많은 메소드를 재사용한다!
	}
	
	
	
	
	
	
	
	
	
	
	
}
