package com.multi.ex05.method_test;

public class TestMethod {

	public static void main(String[] args) {
		
		// static 메소드 사용법 : Class이름.메소드이름()
		MyObject.staticMethod(); // static 메소드는 이텔릭체로 기울어짐, 이게 표준적인 문법!
		MyObject test = new MyObject();
		test.staticMethod(); // 생성된 객체를 통해 접근은 가능하지만 권장하지 않음.
	}
	
}


class MyObject {
	
	// static 메소드 : 외부에서 클래스의 생성(new)없이 접근 가능한 메소드
	// public static을 대부분 사용한다.
	public static void staticMethod() {
		System.out.println("Static 메소드입니다.");
	}
	
	//인자 1개 받는 메소드
	public void singleParameter(String str) {
		System.out.println(str);
	}
	
	
	//인자는 무제한으로 선언은 가능하지만, 상식적으로 3 ~ 4개까지 적당. 많으면 5개까지는 OK...
	// 							-> 프레임워크로 가면 많아도 허용됨
	//인자 2개이상 받는 메소드
	protected void multipleParameter(int a, int b, String str) {
		System.out.println(a + b);
		System.out.println(str);
	}
	
	//반환값이 있는 메소드
	int returnValue(int a, int b) {
		return a+b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}