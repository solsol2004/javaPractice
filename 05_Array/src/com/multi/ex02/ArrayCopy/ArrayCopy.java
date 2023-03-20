package com.multi.ex02.ArrayCopy;

import java.util.Arrays;

public class ArrayCopy {
	// 얕은 복사 : 배열의 주소지만 복사하여 동일한 배열을 활용하는 기법 , 바로가기, link
	// 깊은 복사 : 배열의 주소지가 아니고, 실제 배열을 물리적으로 복사하는 기법, 복사하기, copy
	
	public static void main(String[] args) {
		//얕은 복사 해보기
		int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = array1; //얕은 복사 실행! Shallow copy
		
		System.out.println("변경 전");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		array1[0] = 5;
		
		System.out.println("변경 후");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//깊은 복사 해보기, Deep copy ★★★★★
		int[] array3 = null;
		System.out.println("깊은 복사 시작!");

		
		// 1. 고전적인 방법 = 손으로 쓰는 방법
		array3 = new int[array1.length]; // 복사 대상과 길이를 똑같이 생성
		for(int i = 0; i < array1.length; i++) {
			array3[i] = array1[i]; // 복사!
		}
		
		System.out.println(Arrays.toString(array3));
		
		
		// 2. 복사할때 제일 많이 쓰는 문장 ★★★★★ 매우 유용 -> 길이를 조절할 수 있음
		array3 = Arrays.copyOf(array1, array1.length);

		System.out.println(Arrays.toString(array3));
		
		// 3. 그다음 방법
		array3 = array1.clone();
		
		// 변경
		array1[0] = 10;
		array3[0] = 1000;
		System.out.println("변경 후 1, 3");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array3));
		
		
		
		
	}
}
