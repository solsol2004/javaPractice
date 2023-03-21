package com.multi.ex01.fisrt_object;

// JAVA 언어 규칙중 하나
// 	-> .java 파일의 이름은 public class와 일치해야 컴파일 가능!

public class FirstObject {
	public static void main(String[] args) {
		Person person1 = new Person(); // 객체를 생성하는 키워드 = new!
		person1.name = "홍길동";
		person1.age = 27;
		person1.phoneNum = "010-1234-5678";
		person1.address = "서울시 강남구 역삼동";
		person1.printInfo();
	}

}

// public class: .java 파일과 이름이 일치하는 class이고, 파일당 하나만 존재 가능함!
// default class: public class가 아닌 일반 class를 의미하고, 외부에서 접근 불가!

//public class Person { // public class가 파일에 2개 이상 존재해서 에러 발생!
class Person {
	String name;
	int age;
	String phoneNum;
	String address;
	
	void printInfo() {
		System.out.println("name: " + name + ", age : "+ age);
	}
}

class 사람 {
	String 이름;
	int 나이;
	String 전화;
	String 주소;
}

class 고양이{
	String 이름;
	int 나이;
	String 울음소리;
	String 종;
}

