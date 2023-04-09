package com.multi.ex01.generic;

import java.util.Date;

public class GenericBasic {
	public static void main(String[] args) {
		// Type을 정하지 않고 Object 배열 선언하는 경우의 문제점
		// 1. 지정된 Type이 아닌 다른 Type에 대한 Check가 항상 필요했다. instanceof
		// 2. 객체를 제대로 활용하기 위해선 casting 필요했다.
	
		Object[] array = new Object[10];
		array[0] = "홍길동";
		array[1] = new Date();
		
		if(array[0] instanceof String) {
			System.out.println(((String)array[0]).length());
		}
		
		// 문제를 해결하기 위해 Type을 외부에서 정해주는 사용자 배열을 만들어 보자!
//		MyGenericArray<User> userArray = new MyGenericArray<User>(10);
		MyGenericArray<User> userArray = new MyGenericArray<>(10); // 1.8
		userArray.add(new User("test1", "홍길동", 26));
		userArray.add(new User("test2", "김길동", 31));
		userArray.add(new User("test3", "최길동", 23));
//		userArray.add("김길동");
//		userArray.add(new Date());
		// 컴파일 적으로 자신이 정하지 않은 Type은 에러가 발생한다!
		
		User user = userArray.get(0); // casting이 필요 없다!
		System.out.println(user);
		System.out.println(userArray.get(1));
		System.out.println(userArray.get(2));
		
		
		// MyGeneric 상속 문법 1 - ?(와일드카드) 표현법 
		MyGenericArray<? super Number> numberArray = new MyGenericArray<>(10);
		numberArray.add(new Integer(4));
		numberArray.add(31); // auto boxing 
		numberArray.add(new Double(3.14121212));
		numberArray.add(new Float(3.14));
//		numberArray.add(new String("최길동")); // 안된다!
		
		System.out.println(numberArray.get(0));
		System.out.println(numberArray.get(1));
		System.out.println(numberArray.get(2));
		System.out.println(numberArray.get(3));
		
		// MyGeneric 상속 문법 2 - 일반적인 표현법
		MyGenericArray<Number> numberArray2 = new MyGenericArray<>(10);
		numberArray2.add(new Integer(4));
		numberArray2.add(31); // auto boxing 
		numberArray2.add(new Double(3.14121212));
		numberArray2.add(new Float(3.14));
		
		System.out.println(numberArray2.get(0));
		System.out.println(numberArray2.get(1));
		System.out.println(numberArray2.get(2));
		System.out.println(numberArray2.get(3));
		
	}
}

















