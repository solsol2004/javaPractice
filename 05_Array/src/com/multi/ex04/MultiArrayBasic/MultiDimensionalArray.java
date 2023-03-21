package com.multi.ex04.MultiArrayBasic;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		// 1. 가장 기본적인 2차원 배열 활용법
		int[][] array1 = new int[10][10]; // 10 X 10 = 100개 int 공간 생성! 
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				array1[i][j] = i * 10 + j; // 0 ~ 99
				System.out.print(array1[i][j] + " "); // 행렬 ij를 출력
			}
			System.out.println();
		}
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[j][i] + " "); // 행렬 ji를 출력
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2. 2차원 가변형 배열 활용법
		int[][] array2 = new int[10][]; // 2차원 배열의 크기가 선언되지 않은 상태
		System.out.println(Arrays.toString(array2));
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = new int[i + 1]; // 1 2 3 4 5 6 7 ... 10
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = i * 10 + j;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 3. 2차원 배열 초기화 + 생성
		int[][] array3 = {{1,2,3,4},
						  {2,4}, // 가변선언 가능!
						  {4,3,2,1}};
		
		int[][] array4 = new int[][]{{1,2,3,4},
									 {2,4}, // 가변선언 가능!
									 {4,3,2,1}};
									 
		int[][] array5 = new int[][]{new int[]{1,2,3,4},
									 new int[]{2,4}, // 가변선언 가능!
									 new int[]{4,3,2,1}};

		for(int i = 0; i < array3.length; i++) {
			for(int j =0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] +" ");
			}
			System.out.println();
		}
	}
}
