package com.multi.ex03.run;

import com.multi.ex02.object.Person;

public class Run {
	public static void main(String[] args) {
		//Person 실습 시작
		Person p = new Person(); // 짧게 p로 많이 사용한다, 객체 변수로 선언시에는 줄임말 또는 한글자로 사용해도 허용하는 추세!
		
		System.out.println("Person Default 값 출력!");
		System.out.println(p.name); // 생성자에서 초기화된 값이 출력
		System.out.println(p.age); // 숫자는 0에 준하는 값으로 초기화
		System.out.println(p.phoneNum); // 참조변수는 일반적으로 null로 초기화
		System.out.println(p.address);
		System.out.println("----------------------------------");
	
		//멤버 변수로 접근하는 방법
		p.name = "홍길동";
		System.out.println(p.name);
		p.sayHello();
		System.out.println("----------------------------------");

		//getter/ setter 사용
		p.setName("최길동");
		System.out.println(p.getName());
		System.out.println("----------------------------------");

		
		//이름과 주소를 동시에 변경
		p.setNameAndAddress("박길동", "서울시 강남구 도곡동");
		System.out.println(p.getName() + ", " + p.getAddress());
		System.out.println("----------------------------------");

		
		//set을 get으로 받아오는 방법
		String name = p.setAndGetName("김길동");
		System.out.println(name);
		System.out.println("----------------------------------");


	
		//Person 실습 종료
	}
}
