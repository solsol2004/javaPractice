package com.multi.ex05.assignment_operation;

//대입 연산자
public class AssignmentOperator {

	public static void main(String[] args) {
	// 가장 기초적인 대입(Assign) 방법
	int a = 10;
	int b = 10;
	
	a = a + 10;
	System.out.println(a);
	
	b += 10; // 위에 표현과 논리적으로 동치하다. 
	System.out.println(b);
		
//	*주의: 앞뒤 바꿔서 사용하면 못잡는다!
//	b =+ 10; // 잘못된 문법이 아니고, b에 +10을 대입한 연산
	System.out.println(b);	// 30? 아니고 10이 출력됨!
		
	// 오칙연산	
	b += 10;        
	b -= 10;        
	b *= 10;        
	b /= 10;        
	b %= 10;        
	
	// Selection mode -> alt + shift + a
	// Selection mode에서는 한글이 잘 안먹힌다. 주의할것!
	
	// 잘못된 연산법 주의 필요!!
	b =+ 10; //b = (+10)
	b =- 10; //b = (-10)
//	b =* 10; //b = (*10) // 문법 오류 발생!
//	b =/ 10; //b = (/10) // 문법 오류 발생!
//	b =% 10; //b = (%10) // 문법 오류 발생!

	
	
	
	
	
	
	
		
	}
}
