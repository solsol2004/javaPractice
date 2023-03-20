package com.multi.ex02.loop;

public class LoopStatement3_GuGuDan {
	public static void main(String[] args) {
		// 구구단은 이차원 for문으로 구성되야 한다 (반복문이 중첩되야 한다!!)
		
		// Step1. 2단 for문을 기계적으로 완성한다. 단, 밖은 i로 안은 j로 변수 선언, 참고 i -> j -> k
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
//				System.out.println(i + "X" + j + " = " + (i*j));
			}
		}
		
		// Step2. 출력을 해보고 i와 j의 시작점과 끝점을 조절하면서 구구단을 완성한다.
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "X" + j + " = " + (i*j));
			}
		}
		
		// Step3. 안쪽 반복문 위 아래로 공간이 있다는 것을 활용하자!! -> 데코레이션
		for(int i = 2; i < 10; i++) {
			System.out.println("--------" + i + "단 시작! ---------");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + " = " + (i*j));
			}
			System.out.println("------------------------\n");
		}
		
		
		
		
		
	}
}
