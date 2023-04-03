package com.multi.ex01.object;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Object란? 모든 Class의 최상위 부모
public class BasicObject {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object object1 = new Object();
		Object object2 = new String("test");
		Object object3 = "test";
		
		//toString : 일반적으로 객체의 정보를 출력함, 메소드 없이 객체 이름만으로 호출해도 자동으로 호출됨
		System.out.println(object1); // java.lang.Object@3d012ddd : Class 이름 @ 해쉬코드 = 식별자
		System.out.println(object1.toString());
		System.out.println(object2.toString()); // String에서 오버라이드된 toString()
		System.out.println(object3.toString()); // String에서 오버라이드된 toString()
		
		// hashCode : 객체의 고유 식별 번호
		System.out.println(object1.hashCode()); // 1023487453
		System.out.println(object2.hashCode()); // 3556498
		System.out.println(object3.hashCode()); // 3556498
		
		// equals : 객체간의 고유 번호 비교
		System.out.println(object2.equals(object3));
		System.out.println(object2.hashCode() == object3.hashCode());
		
		// getClass : Class의 정보를 가져올때 활용 (클래스 이름, 메소드, 멤버변수 선언된 값, 실제값)
		// -> 해당 기능을 통해 Class의 모든 정보를 알수있고 자동화 처리가 가능하다 (Spring의 핵심 원리)
		// 자세한건 리플랙션 개념글 참고 : https://steady-coding.tistory.com/609
		System.out.println(object3.getClass().getName()); // 패키지 포함한 이름
		System.out.println(object3.getClass().getSimpleName()); // 클래스 이름
		System.out.println(object3.getClass().getSuperclass().getName()); // 부모
		for(Method method : object3.getClass().getMethods()) {
//			System.out.println(method.getName());
			if(method.getName().equals("length")) {
				System.out.println(method.invoke(object3, null));
				System.out.println(((String)object3).length());
			}
		}
	}
	
}
