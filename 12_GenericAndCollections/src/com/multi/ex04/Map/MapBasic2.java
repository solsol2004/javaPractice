package com.multi.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasic2 {
	public static void main(String[] args) {
		ArrayList<User3> list = new ArrayList<User3>();
		list.add(new User3("testID1", "김길동1", 21, 10000.123));
		list.add(new User3("testID1", "김길동1", 21, 10000.123)); // 완전동일
		list.add(new User3("testID3", "김길동3", 23, 444000.123));
		list.add(new User3("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
		list.add(new User3("testID2", "김길동2", 22, 10000.123));
		
		//   Key    Value
		Map<String, User3> map = new HashMap<>();  
		
		// 1. 데이터 삽입하는 방법
		for(User3 user : list) {
			map.put(user.getId(), user); // 기본적인 방법, 기존에 있던 데이터를 덮어쓰기 하는 용도
			// 덮어 쓰기 하지 않는 방법1 ★★★★★
//			if(map.get(user.getId()) == null) {
//				map.put(user.getId(), user);
//			}
			
			// 덮어 쓰기 하지 않는 방법2
			// containsKey : 키값이 있는지 확인하는 메소드
//			if(map.containsKey(user.getId()) == false) {
//				map.put(user.getId(), user);
//			}
			
			// 덮어 쓰기 하지 않는 방법3
//			putIfAbsent : 만일 키값이 없을 경우만 put이 되는 기능
//			map.putIfAbsent(user.getId(), user);
		}
		
		
		System.out.println(map.toString().replace("],", "],\n"));
		System.out.println("---------------------------------------------");
		
		// 2. 순회하는 방법
		Set<String> keySet = map.keySet(); // 키로 이뤄진 세트
		for(String key : keySet) {
			System.out.println(map.get(key));
		}
		
		// getOrDefault : 값을 가져오는데 null일경우 default 값을 설정하는 방법
		System.out.println(map.getOrDefault("키가 없을때 default값", new User3()));

		// getOrDefault가 없었던 경우 -> if문 필요했었다.
		User3 user = map.get("key값 없는거");
		if(user == null) {
			user = new User3(); // 초기화 문법
		}
		System.out.println("----------------------------------------------");
		
		// 3. 삭제하는 방법
		User3 removeUser = map.remove("testID1"); // key값으로 삭제하기!
		if(removeUser == null) {
			System.out.println("삭제되지 않음");
		}else {
			System.out.println("삭제 완료 : " + removeUser);
		}
		
		// 4. 수정하는 방법
		// 덮어 쓰는 방법 -> put을 통해 새로운 객체 덮어쓰면 된다. 편하고 좋다.
		// put이나 replace로 교체하면 된다.
		map.put("testID2", new User3("testID2", "홍길동3", 41, 3300.123));
		map.replace("testID2", new User3("testID2", "홍길동3", 41, 3300.123)); 
		
		// 기존에 있는 객체의 특정 값만 바꾸고 싶을때
		User3 user3 = map.get("testID2");
		user3.setName("임길동");
		System.out.println(map.get("testID2"));
		map.get("testID2").setAge(31); // 만일 null이 되면 에러발생되서 위험한 문장
		System.out.println(map.get("testID2"));
		
		// 5. 데이터 모두 삭제하기
		map.clear(); // 당장 초기화하는 방법 
		map = null;  // 이것도 모두 삭제하는 방법, java JVM 정리하는 방법
		System.out.println(map);
	}

}















