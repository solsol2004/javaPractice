package com.multi.ex03.branch;

public class BranchStatement1 {

	// 분기문 2가지
	// continue : 반복문에서 흐름을 스킵하는고 위로 올라가는 문장 (단, 반복문은 끝나지 않고 다음 스탭으로 넘어감!)
	// break : 반복문을 벗어나는 문장 (끝나는 문장)

	// 반복문 분기를 종료시키는 3가지 방법
	// break : 반복문이 종료되는 문장 -> 반복문은 끝나지만 반복문 아래가 계속 실행 가능
	// return : 반복문이 포함된 함수를 종료하는 문장 -> 함수 자체가 종료되는 문장
	// System.exit(0) : 프로그램 종료!, 권장하지 않음.

	public static void main(String[] args) {
		// 짝수가 아닌 31의 배수를 찾아본다. 범위 : 1 ~ 1000
		// 총 10개가 찾아지면 10번째 수를 출력하고 끝낸다.

		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) { // 짝수이면 Skip 필요!
				continue; // 해당 문장을 만나면 아래를 실행하지 않고 i++로 이동
			}
			// 홀수만 들어온다!
			if (i % 31 == 0) { // 31의 배수 찾는 방법
				count++;
				if(count == 10) {
					System.out.println(i); // 10번째 31의 배수 출력!
					break; // 반복문을 종료시키는 키워드
//					return;// 메소드를 종료시키는 문장, main 메소드 밖으로 나간다! -> 밑의 count가 출력되지 않음! (게임 종료 버튼)
//					System.exit(0); // 프로그램 자체를 종료시키는 문장! alt + F4
				}
			}

		}
		
		System.out.println("count: " + count);
	}

}
