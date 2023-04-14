package com.multi.ex01.lambda;

public class LambdaBasic {

	public static void main(String[] args) {
		// 람다식이란?
		// - 함수형 프로그래밍이 가능한 순수 함수 문법
		// - 메서드를 하나의 식(반드시 입력과 출력이 있는 식)으로 표현 가능한 문법
		// - 기존 익명 클래스로 가능한 방법이었으나 그 문법을 간편화하여 구성/
		
		// 람다식으로 run()를 구현한 코드 ★★★ -> 코드량이 줄었다.
		MyLambda f1 = () -> System.out.println("f1.run()");
		// 여러줄을 사용할 경우는 코드 가독성이 떨어진다.
//		MyLambda f1 = () -> System.out.println("f1.run()"); System.out.println("f1.run()"); System.out.println("f1.run()"); System.out.println("f1.run()");
		f1.run();

		// 람다식을 기존 방식으로 구현하는 코드 -> 앞으로 우리가 많이 사용할 기법
		MyLambda f2 = new MyClass();
		f2.run();
		
		// 람다식을 기존 익명 클래스로 구현하는 코드 -> 이정도 코드량은 람다식으로 교체하는게 올바르다.
		MyLambda f3 = new MyLambda() {
			@Override
			public void run() {
				System.out.println("f3.run()");
			}
		};
		f3.run();
	}
}
