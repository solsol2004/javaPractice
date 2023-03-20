package com.multi.ex04.logical_operator;

// 논리연산자 = boolean으로만 가능!
public class LogicalOperator {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z = true;
		
		System.out.println(x && y); // AND 연산: 둘다 참일때만 참
		System.out.println(x || y); // OR 연산: 둘 중 하나라도 참이면 참
		System.out.println(x && y && z); // 3항 AND 연산이 가능!
		System.out.println(x || y || z); // 3항 OR 연산이 가능!
		System.out.println(x || y && z); // 우선순위는 AND가 높음!, 순서 y && z -> x || y, 참!
		System.out.println((x || y) && z); // 연산자 우선순위가 명확하지 않으면 괄호사용!
		System.out. println("---------------------------------------------------");
		// * 괄호는 습관적으로 쳐도 문제 없음! ★★★★★
		
		// 비교 연산자, number만 가능!
		int a = 100;
		int b = 50;
		System.out.println(a > b); //a가 b보다 큰가?
		System.out.println(a < b); //a가 b보다 작은가?
		System.out.println(a >= 100); //a가 100보다 크거나 같은가?
		System.out.println(a <= 100); //a가 100보다 작거나 같은가?
		System.out. println("---------------------------------------------------");
		
		// 비교 연산자 응용
		int c = 70;
		// c는 a보다 작고, b보다는 큰가?
//		System.out.println(a > c > b); //안됨!
//		System.out.println((a > c) > b); //안됨!
		System.out.println(c < a && c > b); //관례적으로 외워야 하는 문법! ★★★★★
		
		// a는 50보다 크고, 150보다 작은가?
		System.out.println(a > 50 && a < 150);
		
		// b는 20이상, 100 미만인가?
		System.out.println(b >= 20 && b < 100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
