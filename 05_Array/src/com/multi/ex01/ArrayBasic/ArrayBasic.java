package com.multi.ex01.ArrayBasic;

import java.util.Arrays;

// 배열
public class ArrayBasic {

	public static void main(String[] args) {
		System.out.println("1. 배열 기본 생성법");
		
		int[] array = null; // null로 초기화가 가능하다? 참조형 변수
		array = new int[10]; // 10개 공간을 heap에 생성하고, 0으로 초기화하는 문장
		// 만일 배열을 생성하지 않고 사용하는 경우 -> NullPointerException: Cannot load from int array because "array" is null
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		// 사용자가 직접 배열에 접근하여 초기화하는 방법
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		
		//반복문으로 초기화하는 방법
		for(int i = 0; i < 10; i++) { // 정상 문법, in[10]에서 10개 생성했으니 10을 사용하면 된다!
//		for(int i = 0; i <= 9; i++) { // 권장하지 않는 문법! 사용하지 말것!
//		for(int i = 0; i <= 10; i++) { // ArrayIndexOutOfBoundsException : 범위를 벗어난 에러
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("2. 배열 직접 선언하는 방법");
		int[] array2 = new int[10]; // 표준적인 배열 선언법 ★★★★★
		int[] array3 = {1,2,3,4,5,6,7,8,9,10, 11, 12}; // 직접 선언법 ★★★★★
		int[] array4 = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int[] array5 = new int[10] {1,2,3,4,5,6,7,8,9,10}; // 크기를 지정하면 에러 발생!
		
		// Hard 코딩: 사람이 직접 상수나 특정 데이터 값을 기입하는 방법
		// Hard 코딩은 약간 부정적인 표현법으로 문제가 발생할 수 있음.
		// 문제점: 동적인 상황에서 프로그램의 오류를 발생시킴!
		
		//아래의 'i < 20' 이 부분이 하드 코딩되어 있다.
//		for(int i = 0; i < 20; i++) { // 만일 크게 지정한 경우 문제 발생!
//			System.out.println(array3[i]);
//		}
		
		// 배열을 순회할 경우 아래의 표현법을 외워야 한다!! ★★★★★
		// array3.length: 배열의 크기를 담은 변수
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		System.out.println("3. 배열 표준적인 사용법");
		int[] array5 = new int[12]; // 배열 선언 및 크기를 12로 초기화하는 문장
		for(int i = 0; i < array5.length; i++) {
			array5[i] = i;
		}
		
		// 간단하게 출력하는 방법
		System.out.println(Arrays.toString(array5));
		
		// 문자열 배열
		String[] strArray1 = new String[5];
		String[] strArray2 = {"사과", "바나나", "딸기", "멜론"};
	
		System.out.println(Arrays.toString(strArray2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
