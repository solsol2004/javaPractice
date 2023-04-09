package com.multi.ex02.collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListBasic2 {

	public static void main(String[] args) {
		// 데이터 생성 및 삽입하는 방법
		ArrayList<User1> list = new ArrayList<>();
		
		// 데이터 add 하는 방법
		list.add(new User1("TestID3", "홍길순3", 44, 11110.1));
		list.add(new User1("TestID4", "홍길순4", 21, 143.1));
		list.add(new User1("TestID2", "홍길순2", 22, 100.1));
		list.add(new User1("TestID5", "최길순", 32, 4400.1));
		list.add(new User1("TestID6", "홍길순", 25, 10550.1));
		list.add(new User1("TestID7", "홍길순", 21, 10550.1));
		list.add(new User1("TestID8", "홍길순", 25, 20550.1));
		list.add(new User1("TestID1", "김길순", 25, 10550.1));
		print(list);
		
		// 특정 index에 데이터를 삽입하는 방법
		list.add(0, new User1("TestID9", "홍길순9", 24, 234723));
		print(list);
		
		// 크기 확인하는 법
		System.out.println(list.size());
		System.out.println("-------------------------------------------------------\n");
		
		// 원하는 index의 값 가져오기
		User1 user = list.get(3);
		System.out.println(user);
		System.out.println(list.get(3));
		System.out.println(list.get(3).getName());
		System.out.println("-------------------------------------------------------\n");

		// 특정 객체가 List에 있는지 확인하는 방법
		// -- 잘 안쓴다.
		System.out.println(list.contains(user));
		System.out.println("-------------------------------------------------------\n");
		
		// 객체의 멤버변수가 특정값이 있는지 확인하는 방법(이름으로 찾기)
		for(User1 u : list) {
			if(u.getName().equals("홍길순")) {
				System.out.println(u);
			}
		}
		System.out.println("-------------------------------------------------------\n");
		
		
		// 데이터 삭제하는 방법
		User1 user2 = list.remove(3); // 삭제한 값을 리턴한다!
		System.out.println("제거된 user : " + user2);
		System.out.println("-------------------------------------------------------");
		print(list);
		
		// 정렬하는 방법 ★★★★★
		System.out.println("정렬 하는 방법");
		
		// 1. 객체에 Comparable 구현
		//  - 객체 내부에 정렬 기준을 정의하는 방법으로 단 하나의 정렬 기준만 정할수 있는 방법
		//    -> 만일 다른 정렬 기준이 필요한 경우 2번째 방법을 사용할것을 권장
		Collections.sort(list);
		print(list);
		
		// 2. Comparator를 구현해서 활용 ★★★★★★
		//  - 다양한 방법으로 정렬 기준을 정할수 있다.
		//    -> 단점 : 문법이 어렵다.
		//  나이순으로 정렬!
		System.out.println("나이순 정렬");
		list.sort(new Comparator<User1>() {
			@Override
			public int compare(User1 o1, User1 o2) {
				// (x < y) ? -1 : ((x == y) ? 0 : 1)
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});
		print(list);
		
		// 3. 람다식 정렬 방법 (Java8) ★★★★★★
		//   - 익명클래스나 함수를 (v1, v2)-> returnValue 형식으로 바꿔준 함수형 프로그래밍(=람다) 문법 
		//     -> 생소하면 코드 가독성 떨어짐
		// 계좌 잔액으로 정렬
		System.out.println("계좌순 정렬");
		Collections.sort(list, (o1, o2) -> Double.compare(o2.getAccount(), o1.getAccount()));
		print(list);
		
		// 4. Stream을 통한 정렬 (Java8) -> 아직은 비추하는 문법
		//  - 람다와 Stream 고유 문법을 통해 정렬하는 방법
		//    -> 생소하거나 초보가 사용하기에는 어렵다.
		System.out.println("나이순 정렬");
		List<User1> sortList = list.stream()
							  .sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
							  .collect(Collectors.toList());
		print(sortList);
		
		// 이름-나이순-계좌순 정렬
		System.out.println("이름-나이순-계좌순 정렬");
		list.sort(new Comparator<User1>() {
			@Override
			public int compare(User1 o1, User1 o2) {
				int result = o1.getName().compareTo(o2.getName());
				if(result == 0) {
					result = Integer.compare(o1.getAge(), o2.getAge());
				}
				if(result == 0) {
					result = Double.compare(o1.getAccount(), o2.getAccount());
				}
				return result;
			}
		});
		print(list);
	}
	
	public static void print(List<User1> list) {
		for(User1 item : list) {
			System.out.println(item);
		}
		System.out.println("-------------------------------------------------------\n");
	}
}





