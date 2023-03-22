package Operator;

import java.util.Scanner;

public class OperatorPractice {

		//글로벌 변수로 사용
		public static Scanner sc = new Scanner(System.in);
		
		public void practice1(){
			System.out.println("첫번째 문제 풀이");
			
			System.out.printf("인원 수 : ");
			int ppl = Integer.parseInt(sc.nextLine());
			
			System.out.printf("사탕 개수 : ");
			int can = Integer.parseInt(sc.nextLine());
			
			System.out.println("1인당 사탕 개수 : " + (can / ppl));
			System.out.println("남는 사탕 개수 : " + (can % ppl));
		}
		
		public void practice2(){
			System.out.println("두번째 문제 풀이");
			
			System.out.printf("정수 :");
			int num = Integer.parseInt(sc.nextLine());
			
			String result = num > 0 ? "양수다" : "양수가 아니다";
			System.out.println(result);
		}
		
		public void practice3(){
			System.out.println("세번째 문제 풀이");
			
			System.out.printf("정수 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			String result = num > 0 ? "양수다": (num == 0? "0이다" : "음수다");
			System.out.println(result);
		}
		
		public void practice4(){
			System.out.println("네번째 문제 풀이");
			
			System.out.printf("정수 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			String result = num % 2 == 0? "짝수다" : "홀수다";
			System.out.println(result);
		}
		
		public static void main(String[] args) {
			OperatorPractice practice = new OperatorPractice();
			practice.practice1();
			practice.practice2();
			practice.practice3();
			practice.practice4();
		}

	}
