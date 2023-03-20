package com.multi.ex01.conditional;

import java.util.Scanner;

public class IfStatement2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int value = sc.nextInt();
		
		//양수, 0, 음수 판별하는 방법
		if(value > 0) {
			System.out.println("양수입니다");
		} else if (value ==0) {
			System.out.println("0입니다");
		} else {
			System.out.println("음수입니다");
			
		}
		
		
		
		// 100, 1000, 10000 보다 작거나 10000보다 큰수를 구별
		if(value < 100) {
			System.out.println("100보다 작습니다");
		} else if (value < 1000) {
			System.out.println("1000보다 작습니다");
		} else if (value < 10000) {
			System.out.println("10000보다 작습니다");
		} else { /*else if (value >= 10000)*/			
			System.out.println("10000이거나 10000보다 큰수입니다");
		}
		
		if (value > 10000) {
			System.out.println("10000보다 큰수입니다");
		} else if(value <= 10000 && value > 1000) {
			System.out.println("10000보다 작습니다");
		}else if(value <= 1000 && value > 100) {
			System.out.println("1000보다 작습니다");
		} else {
			System.out.println("100보다 작습니다");
		}
		
		// 결론: 순서를 정리하면 깔끔하게 짤 수 있고, 순서가 잘못된 경우 조건절이 복잡해진다!
	}
}
