package com.multi.ex02.string;

public class String1 {
	// String 사용 Tip
	// 1. String의 저장소는 Heap과 String constant pool 두가지가 있다.
	// 2. String constant pool을 사용하는 것이 메모리 관리측면에서 유리하다.
	// 3. String은 new로 생성하지 않는다. -> Heap을 거쳐서 사용하지 않는다.
	// 	-> 이유는 성능적으로 느려진다.
	
	public static void main(String[] args) {
		// String pool = test
		String str1 = "Test String"; // Spring pool, 문자열 선언의 표준, new String()으로 사용하면 안된다.
		String str2 = new String("Test String"); // heap에서 생성된 문자열
		String str3 = str2.toString();	// heap에서 생성된 문자열을 복사
		String str4 = str2.intern(); // Sptring pool에서 다시 문자열을 가져올때 사용하는 메소드
		
		// 문자열들의 고유값 출력
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// equals로 비교 = hashcode 기반으로 비교함으로 모두 같음
		System.out.println("------------equals-------------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println("------------equals-------------");
		
		// ==는 메모리의 주소값 기준으로 비교됨으로 같지 않다!
		System.out.println("------------'=='-------------");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println("------------'=='-------------");
		
		// 메모리 주소
		System.out.println(System.identityHashCode(str1)); //1365202186
		System.out.println(System.identityHashCode(str2)); //1651191114
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		// 문자열 초기화하는 방법
		String temp = ""; // 공백으로 초기화 // temporary의 약자로 임시적인 변수 만들때 자주 사용
		temp += "1234" + "," + "홍길동"; // null 안뜨고 깔끔하게 합쳐진다.
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
