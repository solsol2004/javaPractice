package Control;

import java.util.Scanner;

public class ControlPractice {

	public static Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
		
	}
	
	public void practice2() {
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}
	
	
	public void practice3() {
		System.out.print("정수 : ");

		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

	public void practice4() {
		System.out.print("숫자를 한 개 입력하세요 : ");

		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("양수가 아니다");
			return;
		}
		
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String num = sc.nextLine();
		
		if (num.charAt(7)== '2') {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}
	
	
	public void practice6() {
		System.out.print("나이 : ");

		int num = sc.nextInt();
		
		if(num <= 13) {
			System.out.println("어린이");
		} else if (num > 13 && num <= 19) {
			System.out.println("청소년");
		} else if (num > 19) {
			System.out.println("성인");
		}
	}
	
	public void practice7() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if (id.equals("test") == false) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		
		if (pw.equals("1234") == false) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		System.out.println("로그인 성공");
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int operand1 = Integer.parseInt(sc.nextLine());
		System.out.print("피연산자2 입력 : ");
		int operand2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.nextLine();
		
		String result = ""; // 문자열의 초기화 현업버전
		
		if(operand1 < 1 || operand2 < 1) {
			System.out.println("양수가 아닙니다.");
			return;
		}
		
		switch(operator) {
			case "+" : result += (operand1 + operand2); break;
			case "-" : result += (operand1 - operand2); break;
			case "*" : result += operand1 * operand2; break;
			case "/" : result += String.format("%.6f", ((double)operand1 / operand2)); break;
			case "%" : result += operand1 % operand2; break;
			default : System.out.println("잘못 입력하였습니다. 프로그램 종료");
					  return;
		}
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}
	
	
	public static void main(String[] args) {
		ControlPractice cp = new ControlPractice();
		cp.practice1();
		cp.practice2();
		cp.practice3();
		cp.practice4();
		cp.practice5();
		cp.practice6();
		cp.practice7();
		cp.practice8();

	}
}
