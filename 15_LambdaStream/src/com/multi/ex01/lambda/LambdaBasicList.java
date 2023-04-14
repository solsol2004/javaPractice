package com.multi.ex01.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaBasicList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// list의 요소를 람다식으로 출력하는 방법
		list.forEach(v -> System.out.print(v + ", "));
		System.out.println();
		list.forEach((v) -> System.out.print(v + ", "));  // ★★★★★
		System.out.println();
		// 람다 시그니처 : ( ) -> ~~~~~
		
		// list에서 removeif 사용, 특정 조건에 만족하는 데이터 삭제
		// 2 또는 3의 배수 삭제
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list);
		
		// replaceAll, 모두 교체하는 기능
		// list의 요소를 10 곱하는 방법
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		// Map에서 람다 문법 사용해보기
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		
		map.forEach((k, v) -> System.out.print("{" + k + ":" + v + "}, "));
	}
}













