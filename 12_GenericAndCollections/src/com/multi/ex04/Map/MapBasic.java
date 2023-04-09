package com.multi.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBasic {
	// Map이란? 
	// Key - Value로 데이터가 구성되어 있는 컬랙션
	// Key는 주로 숫자나 문자 활용, Value는 객체를 활용
	// Key 기준으로만 중복확인함 -> Comparable, equals 필요 없음! 
	
	// HashMap 		 : 순서 보장 안되고, 제일 빠른 성능, 가장 많이 사용하는 Map. ★★★★★
	// LinkedHashMap : Key의 삽입순서 보장. ★
	// TreeMap 		 : Key의 문자열로 정렬. ★
	// HashTable 	 : HashMap Thread Safe Version ★ 
	//					현업에서 자주사용  -> ConcurrentHashMap ★★★
	
	public static void main(String[] args) {
		// 기본적인 사용법
		Map<String, String> map = new HashMap<>();
		map.put("key", "value"); // PK, Row
		map.put("키", "값");
		System.out.println(map.get("key"));
		System.out.println(map.get("키"));
		System.out.println("----------------------------------------");
		
		// 객체 활용법
		ArrayList<User3> list = new ArrayList<User3>();
		list.add(new User3("testID1", "김길동1", 21, 10000.123));
		list.add(new User3("testID1", "김길동1", 21, 10000.123)); // 완전동일
		list.add(new User3("testID3", "김길동3", 23, 444000.123));
		list.add(new User3("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
		list.add(new User3("testID2", "김길동2", 22, 10000.123));
		
		// 선언
		//   key     value
		Map<String, User3> hashMap = new HashMap<>();
		Map<String, User3> linkedHashMap = new LinkedHashMap<>();
		Map<String, User3> treeMap = new TreeMap<>();
		
		// 데이터 삽입하는 방법
		for(User3 user : list) {
			hashMap.put(user.getId(), user); // key, value 쌍으로 값을 넣는다.
		}
		for(int i = 0; i < list.size(); i++) {
			User3 u = list.get(i);
			linkedHashMap.put(u.getId(), u);
		}
		list.forEach((u) -> treeMap.put(u.getId(), u));
		
		System.out.println("hashMap");
		System.out.println(hashMap.toString().replace("],", "],\n"));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.size());
		System.out.println(hashMap.get("testID1"));
		System.out.println(hashMap.get("없는 값은 null"));
		System.out.println("-------------------------------------------");
		
		System.out.println("linkedHashMap");
		System.out.println(linkedHashMap.toString().replace("],", "],\n"));
		System.out.println(linkedHashMap.keySet());
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.get("testID1"));
		System.out.println(linkedHashMap.get("없는 값은 null"));
		System.out.println("-------------------------------------------");
		
		System.out.println("treeMap");
		System.out.println(treeMap.toString().replace("],", "],\n"));
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.size());
		System.out.println(treeMap.get("testID1"));
		System.out.println(treeMap.get("없는 값은 null"));
		System.out.println("-------------------------------------------");
		
	}
}


















