package com.multi.ex01.conditional;

import java.util.Scanner;

public class IfStatement3 {
	//강사의 if문 스타일
	// 1. 예외를 먼저 if + return 문으로 필터링한다
	// 2. 정상적인 상황을 아래에 타이핑하여 코드를 구성한다. (0 level로)
	// 이 스타일의 장점: 코드의 복잡도가 줄어든다! (간결해짐)
	
	public static void main(String[] args) {
		//로그인 기능
		//ID를 입력 받고 3글자 미만이면 "id가 짧습니다" -> 실패
		//PW를 입력 받고 8글자 미만이면 실패, PW에 ID가 포함되어 있으면 실패
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해주세요.");
		String id = sc.nextLine();
		
		// 스파게티 코드에 가깝다 -> 아래 스타일처럼 나오면 리팩토링이 필요하다
		if(id.length() > 3) {
			System.out.println("pw를 입력해주세요");
			String pw = sc.nextLine();
			if(pw.length() < 8) {
				System.out.println("pw가 짧습니다");
			} else {
				if(pw.contains(id) == true) {
					System.out.println("pw에 아이디가 포함되어 있습니다");
				} else {
					System.out.println("로그인에 성공했습니다");
				}
			}
			
		} else {
			System.out.println("id가 짧습니다.");
		}
		
	}
}
