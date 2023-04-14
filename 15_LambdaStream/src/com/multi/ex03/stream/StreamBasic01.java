package com.multi.ex03.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasic01 {

	// 스트림이란?
	// - 함수형 프로그래밍이 가능한 순수 함수 문법인 람다의 확장 기능으로 우아한 코딩이 가능하다.
	// - 기존 코드량을 확실히 줄이는 방법으로 사용된다.
	// - 또한 내부적으로 병렬처리를 지원함으로써 더욱 빠르게 데이터 처리가 가능하다.
	//   -> java에서 유일한 공식적인 자동 병렬처리 방법으로 알고는 있어야한다.
	
	// 스트림 병렬처리 : 내부적으로 알고리즘과 Thread를 자동으로 구성하여 병렬처리 가능하다. -> 자동화
	// Thread : 병렬처리가 가능하도록 도구 제공하고 알고리즘은 개발자가 구성 필요 -> 반자동
	
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"abc", "def", "jkl"},
				new String[]{"ABC", "GHI", "JKL"} );
		
		// 원래 스트림을 만들어야하는 방법 -> 배열 스트림을 스트림으로 받아주는 방법
//		Stream<Stream<String>> strStrm = strArrStrm.map(Arrays::stream);

		// flatMap을 통해 2차원을 1차원으로 만들어주는 방법
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		// 정렬하기
//		strStrm.sorted().forEach(System.out::println);
//		System.out.println();
//		
		// 대문자로 바꾸기
//		strStrm.map(String::toUpperCase).forEach(System.out::println);
//		System.out.println();
		
		// 대문자 변경 + 중복 제거
//		strStrm.map(String::toUpperCase).distinct().forEach(System.out::println);
//		System.out.println();

		// 대문자 + 중복제거 + 정렬
		strStrm.map(String::toUpperCase).sorted().distinct().forEach(System.out::println);
		System.out.println();
		
		
		// 1차원 배열로 다시 다루기
		String[] lineArr = {
				"안녕하세요? ",
				"저는 홍길동입니다. ",
				"반갑습니다. ",
			};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.forEach(System.out::print);
		System.out.println();
		
		
		// 1차원 배열 한번에 다루기
		Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "dDd");
		
		strStrm1.map(String::toLowerCase).distinct().sorted().forEach(System.out::print);
	}
}





