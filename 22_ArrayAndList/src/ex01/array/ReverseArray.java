package ex01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	private static void swap(int[] a, int i, int j) {
		// 꼬리 물기로 외우면 쉽다!
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt(); // 요솟수

		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x); // 배열 a의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x = " + Arrays.toString(x));
	}

}
