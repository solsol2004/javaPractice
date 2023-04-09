package com.multi.ex03.collections_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBasic {
	// TreeSet : 중복된 데이터를 허용하지 않고, 데이터가 정렬됨 ★★★
	//           -> Comparable을 사용하여 정렬, 중복도 제거
	// LinkedHashSet : Hash코드 기준으로 중복을 제거, 들어온 순서가 보존
	//			 -> hashCode()을 사용함
	// HashSet : Hash코드 기준으로 중복을 제거, 아무 순서도 보장되지 않음 -> 제일빠르다. ★
	//           -> hashCode()을 사용함
	
	public static void main(String[] args) {
		// 기본적인 문자열 set 다루기 -> 쉽다.
//		Set<String> set = new HashSet<>(); // 랜덤
//		Set<String> set = new TreeSet<>(); // 오름차순 정렬
		Set<String> set = new LinkedHashSet<>(); // 들어온 순서 유지된다.
		set.add("홍길동");
		set.add("박길동");
		set.add("김길동");
		set.add("홍길동");
		System.out.println(set);
		
		// set 반복문
		for(String str : set) {
			System.out.println(str);
		}
		
		// list 전환 문법
		List<String> strList = new ArrayList<>(set);
		System.out.println(strList.get(1));
		
		// 여기까지가 set 기본문법 끝!
		
		// 객체를 통한 set 다루기 -> 이 부분이 까다로움!
		// -> 객체를 개조해야 사용가능하다!
		Set<User2> treeSet = new TreeSet<>();
		Set<User2> linkedHashSet = new LinkedHashSet<>();
		Set<User2> hashSet = new HashSet<>();
		
		List<User2> list = new ArrayList<>();
		list.add(new User2("testID1", "김길동1", 21, 10000.123));
		list.add(new User2("testID1", "김길동1", 21, 10000.123)); // 완전동일
		list.add(new User2("testID3", "김길동3", 23, 444000.123));
		list.add(new User2("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
		list.add(new User2("testID2", "김길동2", 22, 10000.123));
		
		// 1. Set 데이터 추가하는 방법
		treeSet.addAll(list); // 컬랙션으로 초기화하는 방법
		for(User2 u : list) {
			linkedHashSet.add(u); // 하나씩 넣는 방법
		}
		list.forEach((u) -> hashSet.add(u)); // 람다식 표현법
		
		
		// 2. Set 순회하는 방법
		// 1) for문으로 순회하는 방법
		System.out.println("treeSet 순회");
		for(User2 u : treeSet) {
			System.out.println(u);
		}
		System.out.println("----------------------------------------");
		
		// 2) Iterator 활용 - 반복자(?) ★★★
		System.out.println("linkedHashSet");
		Iterator<User2> iter = linkedHashSet.iterator();
		while(iter.hasNext()) {	// hasNext : 다음 데이터가 있는 경우에만 true
			User2 u = iter.next(); // next : 데이터를 가져오는 메소드
			System.out.println(u); 
		}
		System.out.println("----------------------------------------");
		
		
		// 3) 람다식 표현법 (함수형 프로그래밍 문법)
		//	() ->
		System.out.println("hashSet");
		hashSet.forEach((u) -> System.out.println(u));
		System.out.println("----------------------------------------");
		
		// equals 실험
		// 객체에 equals가 구현되지 않은 경우 객체 고유주소로 확인함으로 객체 내용은 달라도 주소가 달라 같지 않다고 나옴
		// 객체 단위로 값을 비교하기 위해선 equals를 자동완성하여 구현 필요.
		User2 u1 = new User2("testID1", "김길동1", 21, 10000.123);
		User2 u2 = new User2("testID1", "김길동1", 21, 10000.123);
		if(u1.equals(u2)) {
			System.out.println("같다!");
		}else {
			System.out.println("틀리다!");
		}
		System.out.println("---------------------------------------------");
		
		// 객체가 있는지 확인하는 방법
		System.out.println(treeSet.contains(u1));
		u1.setId("test333");
		System.out.println(treeSet.contains(u1));
		
		// 객체 단위로 삭제하는 방법
		System.out.println(treeSet.remove(u2));
	}
}














