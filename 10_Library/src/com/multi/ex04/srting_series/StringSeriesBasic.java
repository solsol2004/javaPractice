package com.multi.ex04.srting_series;

public class StringSeriesBasic {
	// String 시리즈간 장단점 비교.
	// 1. String : 가장 기본적인 문자열 Class, 가장 많은 API 보유, immutable(불변성) -> 한번 정해지면 바뀌지 않음
	// - 장점 : 많은 API 제공하고 전용 연산자도 제공, 활용하기 좋음
	// - 단점 : 불변성의 원칙으로 인해 메모리 관리가 필요하고, 문자열 합칠때 연산속도가 엄청 느리다.
	// -> 메모리 많이 먹고, 느리다.
	
	
	// 2. StringBuffer : 문자열에 더하기 연산과 텍스트 교체, 삭제를 위해 개발된 API
	// - 특징 : 가변성 배열 통해 문자열을 삽입, 삭제가 자율적임, Thread safe함
	// - 장점 : 빠르고, 메모리 낭비가 없다.
	// - 단점 : API 지원이 적다. -> String 사용해야함 , Thread safe하여 StringBulider보다 아주조금 느림
	
	
	// 3. StringBuilder : StringBuffer와 기능 동일, Thread safe하지 않음 -> 좀 더 빠르다.
	// String의 덧샘 연산의 예시 -> 느리고 메모리 낭비 심함
	// "a" + "b" + "c" + "d" // 메모리 크기 : 4
//		1) "a" + "b" = "ab" // 메모리 크기 : 6
//		2) "ab" + "c" = "abc" // 메모리 크기 : 9
//		3) "abc" + "d" = "abcd" // 메모리 크기 : 14
	// String Buffer의 덧샘 연산의 예시 -> 빠르고 메모리 낭비 적음
	// append("a") append("b") append("c") append("d")
//		1) "ab" // 메모리 크기 : 2
//		2) "abc" // 메모리 크기 : 3
//		3) "abcd" // 메모리 크기 : 4
	
	public static void main(String[] args) {
		// 0. 선언 및 출력하기
		StringBuffer sb = new StringBuffer("안녕하세요?"); // buffer = 양동이/공간, 버퍼링, 예비공간
//		StringBuilder sb = new StringBuilder("안녕하세요?");
		System.out.println(sb); // toString 생략
		System.out.println(sb.toString());
	}
}
