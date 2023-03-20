package com.multi.ex02.loop;

public class LoopStatement4 {
	public static void main(String[] args) {
		
		// for문 응용 -> 2씩 증가하는 반복문
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		
		// for문 조건문 지정 안하기
		for(int i = 0;; i +=2) {
			System.out.println(i);
			if(i == 100) {
				break;
			}
		}
		
		// for문 무한루프문 -> 권장되지 않음
		for(;;) {
			System.out.println("무한루프");
		}
		
		
	}
}
