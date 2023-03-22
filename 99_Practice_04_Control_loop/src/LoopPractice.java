import java.util.Scanner;

public class LoopPractice {

	public static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}

		for (int i = 0; i < num; i++) {
			System.out.println(i + 1 + " ");
		}
		System.out.println("------------------------------");
	}

	public void practice2() {
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}

		for (int i = num; i > 0; i--) {
			System.out.println(i + " ");
		}
		System.out.println("------------------------------");

	}

	// 어려웠고 중요했던 문제!!
	public void practice3() {
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력하세요.");
			return;
		}
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			// 마지막 index를 돌리지 않는 방법 = 많이 쓰는 패턴
			if(i < num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}

	// 주옥 같은 문제! = 명품문제!
		public void practice4() { // 일반적인 풀이
			System.out.println("첫 번째 숫자");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("두 번째 숫자");
			int num2 = Integer.parseInt(sc.nextLine());
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				return;
			}
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}			
			}else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
		
		// 강사 패턴 - for문으로 최소한으로 타이핑해야한다. -> 이유 for문 요구사항이 바뀌면 2번 손대야하는 코드
		public void practice4_1() { 
			System.out.println("첫 번째 숫자");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("두 번째 숫자");
			int num2 = Integer.parseInt(sc.nextLine());
			
			if(num1 < 1 || num2 < 1 || num1 == num2) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				return;
			}
			
			// Swap 패턴 -> A와 B를 바꿔주는 방법
			// ★★★★★외워라! -> 꼬리 물기 패턴으로!!
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}			
		}

	public void practice5() {
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("===== " + num + "단 =====");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		System.out.println("------------------------------");
	}

	public void practice6() {
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num > 10) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

		for (int i = num; i < 10; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		System.out.println("------------------------------");
	}

	public void practice7() {
		System.out.print("시작 숫자 : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("공차 : ");
		int tol = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < 10; i++) {
			int num1 = num + (tol * i);
			System.out.println(num1 + " ");
			}
		
		System.out.println("");
		System.out.println("------------------------------");
	}

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
		lp.practice1();
		lp.practice2();
		lp.practice3();
		lp.practice4();
		lp.practice5();
		lp.practice6();
		lp.practice7();
		lp.practice8();
		lp.practice9();
	}

}
