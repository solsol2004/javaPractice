package Casting;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 : ");
		int sub1 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("영어 : ");
		int sub2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("수학 : ");
		int sub3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("총점 : " + (sub1 + sub2 + sub3));
		System.out.println("평균 : " + ((sub1 + sub2 + sub3) / 3));
		
	}
}
