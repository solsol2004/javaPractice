package com.multi.ex02.loop;

public class LoopStatement1 {

	public static void myFirstWhileLoop() {
		int count = 0;
		while (true) { // true인 경우를 무한 반복문 혹은 무한 루프문이라고 한다.
			System.out.println("무한 반복문" + count++);
		}
	}

	public static void testWhileLoop() {
		int i = 0; // 초기화문, i = index의 약자

		System.out.println("while 루프 시작");
		while (i < 10) { // 조건절, 동작하는 논리식, i는 0 ~ 9까지 돌고, 10은 도달하지 않는다!
			System.out.println(i++);
		}
		System.out.println("while 루프 끝");
		// while문이 활용되는 케이스
		// 1. 무한루프문
		// 2. 끝이 정해지지 않은 탐색이 필요할때! 아래와 같은 케이스

		// 133의 3번째 배수는 몇인가?
		int count = 0;
		while (true) {
			i++;
			if (i % 133 == 0) {
				count++;
				if (count == 3) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	// doWhile 잘 안씀
	// doWhile은 논리값이 틀려도 최초 한번 실행시켜주는 문법
	public static void testDoWhileLoop() {
		int i = 0;
		do {
			System.out.println(i++);
		} while (i < 10);
		System.out.println("do-While문 끝!");

		i = 100;
		do {
			System.out.println("최초로 한번만 실행되는 출력문!");
		} while (i < 10);
	}

	// for문★★★★★ 제일 많이 활용되는 반복문!
	public static void testForLoop() {
		// 이 패턴을 그대로 손으로 외울때까지 쳐보는것을 권장
		// 0부터 시작하고 10까지 도달하지 않는 for문
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("루프 끝1!");

		// 1 ~ 10까지 루프를 돌리고 싶을때
		// 패턴 1 -> 추천하지 않는 문법! why? 배열 index와 일치하지 않아서!
//		int i = 0; // 라인을 줄이기 위해 for문 안으로 들어감!
		for (int i = 1; i <= 10; i++) { // int i는 반복문에서 돌아가는 지역 변수!
			System.out.println(i);
		}
		System.out.println("루프 끝2!");

		// 패턴 2 -> 항상 기본형을 타이핑하고 i를 조작하여 출력하는 것을 권장!
		for (int i = 0; i < 10; i++) {// 0 ~ 9 -> 1 ~ 10?
			System.out.println(i + 1); // i++이 아님
		}
		System.out.println("루프 끝3!");
	}

	public static void main(String[] args) {
//		myFirstWhileLoop(); //메소드(함수) 호출(Call)하는 방법
//		testWhileLoop();
//		testDoWhileLoop();
		testForLoop();

	}

}
