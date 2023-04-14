package com.multi.ex03.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamBasic02 {

	// stream★ : 서버 프로그래밍에서는 stream 사용 권장, 이미 Server가 Thread 처리가 기본적이라 의미가 없다.
	// parallelStream : Thread환경이 아니고 고속처리가 필요할때 
	public static void main(String[] args) {
		// SQL의 기능을 거의 만들수 있다.
		
		// List - stream : 이 방법을 추천
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 5, 9, 6, 8, 3, 7, 10));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 3, 4, 4, 5, 5, 2));
		List<String> strList1 = new ArrayList<>(Arrays.asList("CCC","BBB","AAA","DDD","ABC"));
		List<String> strList2 = new ArrayList<>(Arrays.asList("AAA","AAA","AAA","AAA","AAA"));
	
		
		// 숫자 - sum, reduce를 통해 Integer sum을 활용할수 있다. reduce 여러개를 하나의 값을 통합할때
		Optional<Integer> sum1 = list.stream().reduce(Integer::sum);
		System.out.println(sum1.get());
		
		// 병렬처리로 sum하는 방법
		Optional<Integer> sum2 = list.parallelStream().reduce(Integer::sum);
		System.out.println(sum2.get());
		
		// 병렬처리로 min값 찾기 방법
		Optional<Integer> min = list.parallelStream().reduce(Integer::min);
		System.out.println(min.get());
		
		// 병렬처리로 max값 방법
		Optional<Integer> max = list.parallelStream().reduce(Integer::max);
		System.out.println(max.get());
		
		// count하기
		long count = list.stream().count(); // 별로 의미 없다.
		System.out.println(count);
		long count2 = list.stream().filter(v -> v > 3 ? true : false).count();
		System.out.println(count2);
		long count3 = list.stream()
						.filter(v -> v > 3 ? true : false)
						.filter(v -> v < 7 ? true : false).count();
		System.out.println(count3);
		long count4 = list2.stream().distinct().count();
		System.out.println(count4);
		
		
		// 출력하는 방법
//		list.stream().forEach(System.out::println);
		list.stream().forEach(v -> System.out.print(v + ","));
		System.out.println();
		
		// 중복제거하기
		strList2.stream().distinct().forEach(str -> System.out.print(str +", "));
		System.out.println();
		
		// 정렬하기
		list.stream().sorted().forEach(v -> System.out.print(v + ",")); // 오름차순
		System.out.println();
		list.stream().sorted((y, x) -> Integer.compare(x, y))
								.forEach(v -> System.out.print(v + ",")); // 내림차순
		System.out.println();
		
		
		// 필터
		list.stream().filter(v -> v > 3 ? true : false)
						.forEach(v -> System.out.print(v + ","));
		System.out.println();
		// A 포함되어 있는 것들 출력
		strList1.stream().filter(str -> str.contains("A"))
						.forEach(v -> System.out.print(v + ","));
		System.out.println();
		
		// 문자열 찾기 -> match
		
		// allMatch : 전체값이 모두 일치할때 사용 -> 주의필요!!
		boolean result1 = strList1.stream().allMatch(s ->  s.equals("AAA"));
		System.out.println(result1); // false
		boolean result2 = strList2.stream().allMatch(s ->  s.equals("AAA"));
		System.out.println(result2); // true
		
		// anyMatch : list에서 일부 값이 일치하는 문자열 찾을때 사용
		boolean result3 = strList1.stream().anyMatch(s ->  s.equals("AAA"));
		System.out.println(result3); // true
		boolean result4 = strList2.stream().anyMatch(s ->  s.equals("AAA"));
		System.out.println(result4); // true
		
		// anyMatch : list에서 일부 값이 일치하는 문자열 찾을때 사용
		boolean result5 = strList1.stream().anyMatch(s ->  s.contains("A"));
		System.out.println(result5); // true
		
		// 컬랙션으로 변경하는 방법
		// limit : 자를때 사용
		List<Integer> list3 = list.stream().sorted().limit(5).toList();
		System.out.println(list3);
	}
}














