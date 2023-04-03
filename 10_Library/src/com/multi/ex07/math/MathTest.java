package com.multi.ex07.math;

import java.util.Random;

// 산술연산 관련된 Class
public class MathTest {
	public static void main(String[] args) {
		// 램덤
		System.out.println((int)(Math.random() * 100)); // 0 ~ 99
		Random ran = new Random();
		System.out.println(ran.nextInt(100));           // 0 ~ 99
	
		// 절대값 - abs
		System.out.println(Math.abs(10));    // 10
		System.out.println(Math.abs(-10));   // 10
		System.out.println(Math.abs(-3.14)); // 3.14
	
		
		// ceil = 올림
		System.out.println(Math.ceil(10.0));      // 10.0
		System.out.println(Math.ceil(10.1));      // 11.0
		System.out.println(Math.ceil(10.000001)); // 11.0

		// floor = 버림
		System.out.println(Math.floor(10.0));     // 10.0
		System.out.println(Math.floor(10.9));     // 10.0
		 
		// round = 반올림
		System.out.println(Math.round(10.0));     // 10
		System.out.println(Math.round(10.4));     // 10
		System.out.println(Math.round(10.5));     // 11
		
		// 숫자 비교
		System.out.println(Math.max(3.14, 3.14159)); // 3.14159
		System.out.println(Math.min(3.14, 3.14159)); // 3.14
		System.out.println(Math.max(-10, -11));      // -10
		System.out.println(Math.min(-10, -11));      // -11
		
		// 제곱, 제곱근
		System.out.println((int)Math.pow(5, 2)); // 25
		System.out.println((int)Math.sqrt(25));  // 5
		
		// sin, cos, tan
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.sin(Math.PI / 6));
		System.out.println(Math.tan(Math.toRadians(45)));
		System.out.println(Math.tan(Math.PI / 4));
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.PI / 3));
	}
	
}