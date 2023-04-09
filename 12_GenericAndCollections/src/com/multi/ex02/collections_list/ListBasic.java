package com.multi.ex02.collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListBasic {
//	ArrayList - ★★★★★ 추천
//	 -> 주로 ArrayList '만' 사용하는데, 이유는 DB에서 데이터를 담고 탐색 용도로 많이 활용함
//	- 장점 : 탐색속도가 빠르고, 메모리를 적게 차지한다. 
//	- 단점 : 삽입, 삭제, 수정이 느리다. 

//	LinkedList
//	 -> 삽입 삭제가 빈번하지 않으면 사용하지 않음. -> 이럴 경우가 많이 없거나 다른 컬랙션(Map)을 사용함
//	- 장점 : 삽입, 삭제, 수정이 빠르다.
//	- 단점 : 탐색속도가 느리고, 메모리를 많이 차지한다.

//	Vector
//	-> Thread safe 할때 사용하나 더 좋은 컬랙션이 많다. 잘 안쓴다.
	
	public static void main(String[] args) {
		// 객체배열 문법
		User1[] userArray = new User1[3];
		userArray[0] = new User1("testID1", "김길동", 23, 60000.212);
		userArray[1] = new User1("testID2", "홍길동", 32, 53123.233);
		userArray[2] = new User1("testID3", "박길동", 25, 41212.322);
//		userArray[3] = new User1("testID4", "양길동", 22, 41212.322);
		
		// 배열의 단점
		// 1. 배열의 크기를 지정해야하고, 크기보다 커지면 새로운 배열을 생성하고 복사 필요
		// 2. 중간에 데이터 삽입/삭제가 어렵다. -> 반드시 빈데이터를 메꿔야한다!
		// 3. 복사도 어렵고, 사용자 실수가 많았다. 
		// 결론 : 프로그래머라면 누구든 고통 받았다.
		
		// List 사용법
		// 1. 초기화 문법
		//  - 선언시 Type은 List<>로 하는 것이 일반적이다. (ArrayList Class이름을 명시하지 않는다.)
		List<User1> list1 = new ArrayList<>(); // 1. 뒤 제네릭 표현에 Type 생략 ★★★★★
		List<User1> list2 = new ArrayList<User1>(); // 2. 1.7미만에서는 표준 문법
		LinkedList<User1> list3 = new LinkedList<>(); // 3. 컬랙션 이름을 노출하는 문법
		ArrayList<User1> list4 = new ArrayList<>();
		// 3번째 문법은 컬랙션 마다 고유기능이 있는데 이를 활용하고자 할때 선언해서 사용한다.
		// LinkedList Queue까지 호환
		
		// 2. 배열 -> List 변환하는 방법
		// 1) asList 활용
		List<User1> userList0 = Arrays.asList(userArray); // 읽기 전용, 확장/수정 불가!
		List<User1> userList1 = new ArrayList<>(Arrays.asList(userArray));
//		userList0.add(new User1("testID4", "양길동", 22, 41212.322));
		userList1.add(new User1("testID4", "양길동", 22, 41212.322));
//		System.out.println(userList0);
//		System.out.println(userList1);
		
		// 2) 고전적인 알고리즘 활용1
		List<User1> userList2 = new ArrayList<>();
		// Advanced for loop
		for(User1 user : userArray) { // 열거형(배열, 컬랙션)에 사용 가능한 반복문
			userList2.add(user);
		}
		
		// 3) 고전적인 알고리즘 활용2
		List<User1> userList3 = new ArrayList<>();
		for(int i = 0; i < userArray.length; i++) {
			userList3.add(i, userArray[i]); // 앞쪽 index를 지정 가능!
		}
		
		// 출력 방법
		// 그냥해도 된다!!
		System.out.println(userList1);
		System.out.println(userList1.toString().replace("],", "],\n"));
		System.out.println("-".repeat(50));
		
		// 순회하면서 출력하는 방법
		for(User1 user : userList2) {
			System.out.println(user);
		}
		System.out.println("-".repeat(50));
		
		for(int i = 0; i < userList3.size(); i++) {
			System.out.println(userList3.get(i));
		}
		System.out.println("-".repeat(50));
		
		// 스트림
		userList3.forEach((user) -> System.out.println(user));
		System.out.println("-".repeat(50));
	}
}



















