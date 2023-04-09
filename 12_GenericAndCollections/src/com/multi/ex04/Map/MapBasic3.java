package com.multi.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapBasic3 {
	public static void main(String[] args) {
		// ID가 중복이 되어도 HashMap으로 유지하는 방법
		List<User3> list = new ArrayList<User3>();
		list.add(new User3("testID1", "김길동1", 21, 10000.123));
		list.add(new User3("testID1", "황길동2", 31, 10000.123)); 
		list.add(new User3("testID1", "충길동3", 51, 10000.123)); 
		list.add(new User3("testID2", "홍길동1", 61, 3300.123)); 
		list.add(new User3("testID2", "고길동2", 32, 10000.123));
		list.add(new User3("testID2", "박길동3", 22, 10000.123));
		list.add(new User3("testID3", "이길동1", 13, 444000.123));
		list.add(new User3("testID3", "김길동2", 23, 444000.123));
		list.add(new User3("testID3", "홍길동3", 33, 444000.123));
		
		// 2가지 방법
		// 1. Key + 다른값을 조합하여 새로운 ID를 만들어 낸다. ex) hash 값, count, 시간 값
		//  - "testID1" + "김길동1" -> 새로운 Key값 생성하는 방법
		//  - 꼼수적인 방법으로 권장하지는 않지만 이것도 좋은 처리방법이 될때도 있다.
		
		// 2. Map + List 형태로 결합하는 방법 ★★★ 추천! -> 오늘의 끝판 왕
		//    key    value = list형태 = 여러 값을 담을수 있는 방법
		Map<String, List<User3>> listMap = new TreeMap<>();
		
		for(User3 item : list) {
			String key = item.getId();
			
			if(listMap.containsKey(key) == false) { // key값이 없을때
				List<User3> tempList = new ArrayList<>();
				listMap.put(key, tempList);
			}
			
			listMap.get(key).add(item);
		}
		
		// testID2 모두 출력
		List<User3> printList = listMap.get("testID2");
		printList.forEach((u) -> System.out.println(u));
		System.out.println("----------------------------------");

		// 전체 순회하는 방법
		Set<String> keySet = listMap.keySet();
		for(String key : keySet) {
			List<User3> tempList = listMap.get(key);
			System.out.println("key : " + key);
			for(User3 u : tempList) {
				System.out.println(u);
			}
		}
		
//		key : testID1
//		User1 [id=testID1, name=김길동1, age=21, account=10000.123]
//		User1 [id=testID1, name=황길동2, age=31, account=10000.123]
//		User1 [id=testID1, name=충길동3, age=51, account=10000.123]
//		key : testID2
//		User1 [id=testID2, name=홍길동1, age=61, account=3300.123]
//		User1 [id=testID2, name=고길동2, age=32, account=10000.123]
//		User1 [id=testID2, name=박길동3, age=22, account=10000.123]
//		key : testID3
//		User1 [id=testID3, name=이길동1, age=13, account=444000.123]
//		User1 [id=testID3, name=김길동2, age=23, account=444000.123]
//		User1 [id=testID3, name=홍길동3, age=33, account=444000.123]
		System.out.println("------------------------------------------------------------");
		
		// 람다식으로 한줄로 출력해보기
		listMap.keySet().forEach((key) -> listMap.get(key).forEach((u) -> System.out.println(u)));
	}
}

















