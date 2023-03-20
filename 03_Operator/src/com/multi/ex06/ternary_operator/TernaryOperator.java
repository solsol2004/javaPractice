package com.multi.ex06.ternary_operator;

// 삼항연산자 + if
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		int c = 30;

		// 삼항연산자
		// 문법 : (조건절) ? (참일때 실행되는 문장) : (거짓일때 실행되는 문장)
		String result = a > b ? "a가 b보다 큽니다." : "a가 b보다 작습니다.";
		System.out.println(result);

		// 중첩 사용 -> 권장하지 않음.. 가독성이 좋지 않음 -> if문으로 변경
		// a, b, c를 비교하는 방법
		result = a > b ? (b > c ? "a가 b보다 크고 b는 c보다 큼" : "a가 b보다 크고 b는 c보다 작음")
				: (b > c ? "a가 b보다 작고 b는 c보다 큼" : "a가 b보다 작고 b는 c보다 작음");
		System.out.println(result);

		// 삼항연산자는 if문으로 완벽히 호환된다!
		// if문이란? 논리값을 비교해주는 문법
		// if(조건식) {조건식이 참이면 실행되는 문장}
		// else {조건식이 거짓이면 실행되는 문장!}

		if (a > b) {
			result = "a가 b보다 큽니다";
		} else {
			result = "a가 b보다 작습니다";
		}
		System.out.println(result);

		// 복잡한 삼항연산자 if문으로 바꾸기
//		result = a > b ? (b > c ? "a가 b보다 크고 b는 c보다 큼" : "a가 b보다 크고 b는 c보다 작음") 
//				: (b > c ? "a가 b보다 작고 b는 c보다 큼" : "a가 b보다 작고 b는 c보다 작음");
		if (a > b) {
			if (b > c) {
				result = "a가 b보다 크고 b는 c보다 큼";
			} else {
				result = "a가 b보다 크고 b는 c보다 작음";
			}
		} else {
			if (b > c) {
				result = "a가 b보다 작고 b는 c보다 큼";
			} else {
				result = "a가 b보다 작고 b는 c보다 작음";
			}
		}
		System.out.println(result);

	}
}
