package com.multi.ex01.basic_poly;

import java.math.BigDecimal;
import java.util.Date;

public class PolyTest {
	//다형성이란?
	// 자식의 타입을 부모의 타입으로 대체할 수 있는 개념
	
		public static void main(String[] args) {
			Object[] objArray = new Object[5]; //java의 만능주머니 -> 최상위 클래스
			// 다형성을 통해 모든 객체형은 Object로 대체될 수 있다.
			// Why? Object는 모든 객체의 부모(최상위 조상)이므로 가능하다.
			
			objArray[0] = new Object();
			objArray[1] = new String("test");
			objArray[2] = new Date();
			objArray[3] = new BigDecimal("12323232.1231233242342342234");
			objArray[4] = (Integer)105; //AutoBoxing = 1.5 용도
//			objArray[4] = new Integer(105); // deprecated
			
			for(int i = 0; i < objArray.length; i++) {
				System.out.println(objArray[i].toString()); //@hashcode
				// 부모의 메소드 toString을 오버라이딩된 toString으로 호출하는 과정
			}
			
			//결과 분석
//			java.lang.Object@5e265ba4 - Object.toString();
//			test - String.toString(); // 오버라이딩된 toString
//			Thu Mar 23 14:18:53 KST 2023 Date.toString();
//			12323232.1231233242342342234 BigDecimal.toString();
//			105 Integer.toString();
		}
}
