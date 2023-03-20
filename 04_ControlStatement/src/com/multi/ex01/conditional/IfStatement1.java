package com.multi.ex01.conditional;

public class IfStatement1 {
		// if문 문법
		// if(조건식1) {
		// 		(조건식1이 참일때 실행되는 문장)
		// }
		// else if(조건식2){
		// 		(조건식2가 참일때 실행되는 문장)
		// }
		// .....
		// else {
		// 		(모든 조건이 해당되지 않을때 실행되는 문장)
		// }
		//
		// 조합1 : if
		// 조합2 : if - else
		// 조합3 : if - else if - else
		// 조합4 : if - else if
	
	public static void main(String[] args) {
		int a = 6;
		
		// 가장 기본적인 if문 스타일
		if(a == 6) {
			System.out.println("6입니다.");
		}
		
		// if - else문 java 스타일
		if(a % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		// if - else문의 c 스타일 (고전 스타일), 추천 X
		if(a % 2 == 0) 
		{
			System.out.println("짝수입니다");
		} 
		else 
		{
			System.out.println("홀수입니다");
		}
		
		// 중괄호가 없어도 if문 활용 가능!
		// 단, if문이나 else문의 바로 아래 한줄만 실행
		// * 권장하지 않는다!!!
		
		if(a % 2 == 0) 
			System.out.println("짝수입니다");
		 else 
			System.out.println("홀수입니다");
		
		
		
		
		
		
		
		
		
		
	}
}
