package com.multi.ex02.object;

// 객체란? 현실에서 존재하는 대상(Object)를 추상화하여 데이터 + 메소드로 표현한 방법
// Person: 한 사람의 개인정보를 추상화한 객체, 추상화: 일부만 활용한다!

public class Person {
	// 이곳을 필드라 함
	// 선언부 - 객체 상단에서 멤버 변수를 선언하는 곳
	public String name;
	public int age;
	public String phoneNum;
	public String address;
	
	// 생성자란?
	// - 객체가 생성될때 호출되는 특별한 메소드
	// - return 값을 가질수 없다! 선언도 불가하다! 만일 만들지 않으면 자동으로 java가 생성해준다.
	// - 용도: 객체의 멤버 변수를 초기화하거나 다른 초기화 로직이 필요할때 활용
	public Person() { // 생성자 - new Person();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
