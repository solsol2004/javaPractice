package com.multi.ex02.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalEx1 {

	// Optional이란?
	// null 또는 값을 감싸서 NPE(NullPointerException)로부터 부담을 줄이기 위해 등장한 Wrapper 클래스 
	// Optional은 값을 Wrapping하고 Null Check로직은 간소화하여 코드의 가독성을 높인다.
	// -> 생산성이 떨어져서 강사는 권장하지 않는다.
	
	public static void main(String[] args) {
		String str = "abcde";
		Optional<String> optStr = Optional.of("abcde");
		Integer integer= 100;
		Optional<Integer> optInt = Optional.of(100);
		
		// optional 출력
		System.out.println(str);
		System.out.println(integer);
		System.out.println(optStr); // Optional[abcde]
		System.out.println(optInt); // Optional[100]
		
		// 값만 출력하는 방법
		System.out.println(optStr.get()); // get 필요
		System.out.println(optInt.get());

		// Null 값 체크하는 방법
		Optional<String> optStr2 = Optional.ofNullable(null);
		if(optStr2.isPresent()) {
			System.out.println(optStr2.get());
		}
		
		int result1 = Optional.of("123")
							.filter(x -> x.length() > 0).map(Integer::parseInt).get(); 
		int result2 = Optional.of("")
							.filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		OptionalInt optInt1 = OptionalInt.of(0);
		if(optInt1.isPresent()); // 존재하는가?
		if(optInt1.isEmpty());	 // 비어있나?
		
//		OptionalDouble 
//		OptionalLong
		
	}
}
