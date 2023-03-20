package com.multi.ex01.conditional;

public class SwitchStatement1 {
	
	public static void main(String[] args) {
		// 점수가 1등급 ~ 4등급으로 변환하는 방법
		// 1등급: 100 ~ 80점, 2등급 80 ~ 60점 ...

		double score = 70.3;
		int grade = (int)(score / 20);
		
		// switch (이곳에 사용 가능한 Type : int, char, String, (열거형...) ) // double(실수)는 안됨!
		switch (grade) {
			case 5: // 100점
			case 4: // 100점 미만 ~ 80점
				System.out.println("1등급 입니다");
				break;
			case 3: // 80점 미만 ~ 60점 이상
				System.out.println("2등급 입니다");
				break;
			case 2: // 60점 미만, 40점 이상
				System.out.println("3등급 입니다");
				break;
			case 1: // 40점 미만, 20점 이상
			case 0: // 20점 미만, 0점 이상
				System.out.println("4등급 입니다");
				break;
			default : // 예외값 처리
				System.out.println(grade + "는 예외값입니다.");
				// 끝은 break문이 필요 없다!
		}
	}

}
