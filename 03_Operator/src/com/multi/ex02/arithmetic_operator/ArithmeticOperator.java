package com.multi.ex02.arithmetic_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 0;
		
		System.out.println("사칙연산");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b); //곱셈
		System.out.println(a / b); //나눗셈
		System.out.println(a / 3); // int Type으로 소수점이 버려짐
		System.out.println(a / 3.0); // 소수점 표현법 1 - double로 3.0 사용
		System.out.println(a / (double)3); // 소수점 표현법 2 - 3을 명시적으로 3.0으로 바꾼 문법
		System.out.println((double)(a / 3)); // 안되는 표현법! - 3 -> 3.0 됨

		// /by zero
//		System.out.println(a / 0); //java.lang.ArithmeticException
		
		System.out.println("% 모듈러 연산");
		c = 10 % 3 ; //나머지 연산
		System.out.println(c);
		c = 10 % 2; // 짝수인지 활용할때
		System.out.println(c); //0 = 짝수
		c = 11 % 2; // 홀수인지 활용할때
		System.out.println(c); //1 = 홀수
		
		c = 9 % 3; // 3의 배수인가?
		System.out.println(c); //3의 배수면 0
		
		//if문으로 짝수 필터링하는 방법
		c = 4;
		if(c % 2 == 0) { // 짝수일떼
			System.out.println(c + "는 짝수입니다.");
		
		} else {
			System.out.println(c + "는 홀수입니다.");
		}
		
		
		// 정수 + 실수 사용시 주의점
		// - 사칙연산시 type의 크기가 큰쪽으로 자동으로 형변환됨
		// - double > float > long > int > short > byte
		
		float pi = 3.14f;
		double x = 1.23456789;
		int i = 10;
		
		
		System.out.println(pi + i); // float
		System.out.println(pi + x); // double
		System.out.println(pi + (float)x); // float
		System.out.println((float)(pi + x)); // float
	
	
	
	
	
	
	
	
	
	}
}
