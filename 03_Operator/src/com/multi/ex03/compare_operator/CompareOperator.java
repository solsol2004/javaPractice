package com.multi.ex03.compare_operator;

// 비교연산자
public class CompareOperator {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println( a == b ); // a와 b가 같은가?
		System.out.println( a != b ); // a와 b가 같지 않은가?
		System.out.println("----------------------------------");
		
		//문자열 비교 ... *주의 : 이해하기 매우 어려움!!!
		String str1 = "안녕하세요?";
		String str2 = "안녕하세요?";
		String str3 = new String("안녕하세요?");
		
		System.out.println(str1 == str2); // 예측 : true
		System.out.println(str1 == str3); // 예측 : true -> 틀림! false 로 나옴
		
		// String 비교시에는 항상 주의 필요, '=='를 사용하면 틀린결과가 나올 수 있다~
		// 문자열 비교는 equals 메소드를 사용할 것! ★★★★★
		System.out.println(str1.equals(str2)); // 예측 : true
		System.out.println(str1.equals(str3)); // 예측 : true -> 성공
		
		
		// 문자열을 포함하는지 확인하는 함수 = contains
		String str4 = "안녕";
		System.out.println(str1.contains(str2)); // 안녕하세요? - 안녕하세요? 가지고 있는지?
		System.out.println(str1.contains(str4)); // 안녕하세요? - 안녕 가지고 있는지?
		System.out.println("안녕하세요?".contains("하이")); // 안녕하세요? - 하이 가지고 있는지?
		
		
		
		
	}
}
