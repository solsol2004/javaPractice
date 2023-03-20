package com.multi.ex07.operator_precedence;


// 연산자 우선순위
public class OperatorPrecedence {
	
	public static void main(String[] args) {
		// 1. 사칙연산 우선순위
		System.out.println(1 + 2 * 3); // 곱셈이 높음!!
		
		//2. 단항 연산자 우선순위
		int a = 10;
		System.out.println(++a * 10); //단항이 높다!
		
		// 3. 산술 논리 복합될때
		System.out.println(3 + 4 > 5); // 산술이 높음, 7 > 5 = true
		System.out.println((3 + 4) == 5); // 괄호를 통해 우선순위 명시적으로 사용 권장!
		
		// 결론: 복잡하거나 헷갈리면 괄호() 써라!
		
	
	}
}
