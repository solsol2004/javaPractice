package com.multi.ex02.object;

// 객체란? 현실에서 존재하는 대상(Object)를 추상화하여 데이터 + 메소드로 표현한 방법
// Person: 한 사람의 개인정보를 추상화한 객체, 추상화: 일부만 활용한다!

public class Person { // this가 찍는 시작점!
	// 이곳을 필드라 함
	// 선언부 - 객체 상단에서 멤버 변수를 선언하는 곳
	// 멤버 변수란? 객체가 가질 수 있는 데이터
	public String name;
	public int age;
	public String phoneNum;
	public String address;
	
	// 생성자란?
	// - 객체가 생성될때 호출되는 특별한 메소드
	// - return 값을 가질수 없다! 선언도 불가하다! 만일 만들지 않으면 자동으로 java가 생성해준다.
	// - 용도: 객체의 멤버 변수를 초기화하거나 다른 초기화 로직이 필요할때 활용
	public Person() { // 생성자 - new Person(); // new 뒤에서 호출되는 메소드가 생성자
		name = "이름 없음";
	}
	
	//메소드 - 객체에서 특별한 기능을 가지는 함수
	//void method() : 인자(입력값)와 리턴값(출력값) 모두 없는 메소드, 가장 기본꼴
	//void: 리턴값이 없을때 메소드 앞에 사용하는 키워드
	public void sayHello() {
		System.out.println("안녕하세요? 저는 " + name + "입니다.");
	}
	
	
	//파라미터(인자)란? : 메소드(함수) 외부에서 입력 값으로 활용되는 변수, 함수의 로컬 변수로 들어간다.
	//this: 자기 자신을 가르치는 키워드, 필드로 돌아와서 멤버변수나 메소드를 찍을 수 있는 키워드
	//void method(인자): 리턴값이 없고, 1개의 파라메터를 가지는 메소드
	//setter의 표준 형태 - write only(쓰기 전용)
	public void setName(String name) {
//		String name = null; // Duplicate local variable name
//		name = "홍길동";
		this.name = name;
	}
	
	
	
	//void method(인자1, 인자2): 리턴값은 없고 인자가 2개 있는 메소드
	public void setNameAndAddress(String name, String address) {
		this.name = name; //멤버 변수의 name = 지역 변수 파라메터의 name
		this.address = address;//멤버 변수의 address = 지역 변수 파라메터의 address 간의 대입연산
	}
	
	//String method() : 인자가 없고 리턴값만 있는 형태
	//getter의 표준 형태 - read only(읽기 전용)
	public String getName() {
		return name; // this.name과 동치, 인자나 로컬변수에 name 변수가 없음으로 멤버변수 name을 찾아온다.
	}
	
	public String getAddress() {
		return address;
	}
	
	// String method(인자) : 인자가 1개 있고, 리턴값이 존재하는 메소드
	public String setAndGetName(String name) {
		this.name = name;
		return this.name;
	
	}
}
