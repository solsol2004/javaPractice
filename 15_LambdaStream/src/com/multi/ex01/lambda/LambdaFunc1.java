package com.multi.ex01.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFunc1 {
	public static void main(String[] args) {
		// 아키텍처 : 생산자-소비자 패턴을 람다로 구현 가능 
		
		// Supplier : 생산자로 특정 값을 생성하는 객체, 입력이 없고 리턴값만 존재
		Supplier<Integer> s = () -> (int) (Math.random() * 100 ) + 1;
		
		// Consumer : 생산을 통해 만들어진 값을 소비하는 객체, 입력은 있고 리턴 값이 없다.
		Consumer<Integer> c = i -> System.out.print(i + ",");
		
		// Predicate : 비교식을 인자를 받을때 사용됨, 주로 필터링할때 필요
		Predicate<Integer> p = i ->  i % 2 == 0; // || i % 3 == 0;
//		Predicate<Integer> p = i ->  i % 2 == 0 && i % 3 == 0;
		
		// y = f(x)구조로 입력값과 출력을 연결할때 사용   
		Function<Integer, Integer> f = i -> i / 10 * 10; // 일의 자리 없애는 방법 14 -> 10
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); // 생성자를 통해 list 값을 초기화 하는 방법
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}	
	
	
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for (T i : list) {
			newList.add(f.apply(i));
		}

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for (T i : list) {
			if (p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for (int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	}
}
