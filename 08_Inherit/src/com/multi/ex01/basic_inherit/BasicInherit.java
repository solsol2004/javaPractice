package com.multi.ex01.basic_inherit;

import java.util.Date;

// Object는 객체의 최상위 부모(Root)
// 모든 클래스는 Object에서 상속받아 작성한 클래스고, Object 상속 문법이 생략 가능함
public class BasicInherit /*extends Object*/{

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new String();
		Object obj3 = new Date();
		Object obj4 = new BasicInherit();
		
		//Class 이름 출력
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3.getClass().getName());
		System.out.println(obj4.getClass().getName());
		
		//Class의 조상 알아보는법
		System.out.println(obj1.getClass().getSuperclass()); //null
		System.out.println(obj2.getClass().getSuperclass());
		System.out.println(obj3.getClass().getSuperclass());
		System.out.println(obj4.getClass().getSuperclass());
		
		
		//Object -> Date로 바꾸는 방법
		System.out.println(obj3);
		System.out.println(((Date)obj3).getTime());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
