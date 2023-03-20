package com.multi.ex01.single_operator;

//단항연산자
public class SingleOperator {

	public static void main(String[] args) {
		// 1. not(!) 연산자: 논리값을 토글(Toggle)하는 용도로 활용
		boolean isTrue = true;

		System.out.println(isTrue);
		System.out.println(!isTrue);
		System.out.println(!!isTrue);

		isTrue = !isTrue;
		System.out.println(isTrue);
		System.out.println("--------------------------");

		// 2. 증감 연산자 ++ --, 전위증감연산자, 후위증감연산자
		int a = 10;

		// 후위 연산은 세미클론 기준으로 뒤에서 더해진다
		System.out.println("a++");
		System.out.println(a++); // 10
		System.out.println(a); // 11

		a = 10;
		System.out.println("++a");
		System.out.println(++a); // 11
		System.out.println(a); // 11

		// ++가 없이 연산하는 전위 연산
//		System.out.println("++a");
//		a = a + 1;
//		System.out.println(a);
//		System.out.println(a);

		// ++가 없이 연산하는 후위 연산
//		System.out.println("a++");
//		a = a + 1;
//		System.out.println(a);
//		System.out.println(a);

	}
}
