package com.multi.ex01.exception;

import java.io.IOException;

public class Trycatch {
	public static void main(String[] args) {
		// 방법0. 손으로 완성하기
		// 방법1. 강사 선호하는 방법 try - 자동완성 안쪽으로 에외 들고오기
		// 방법2. 마우스 우클릭 - 서라운드 위드 - try-catch 감싸기

		try {
			System.out.println("파일 관련 에러가 발생할수 있는 구간 시작");
			if(false) { // 예외가 발생한다는 가정
				throw new IOException(); // 예외가 발생하는 곳
			}
//			System.out.println("자원을 정리하는 문장!"); -> 여기서 쓰면 안된다!!
			System.out.println("파일 관련 에러가 발생할수 있는 구간 끝");
//			System.exit(1); // finally 실행 안시키는 유일한 문장
			return;
			// finally는 리턴이 되어도 실행하고 리턴이 된다.
		} catch (IOException e) { // IOException 예외처리하는 곳, IOException는 Exception의 자식
			System.out.println("예외가 발생하면 실행되는 구간, 예외 받는 곳");
			e.printStackTrace(); // 예외가 발생하면 예외 상태를 알려주고 line도 알려주는 기능
		} catch (Exception e) { // Exception : 모든 예외를 처리하는 구간
			System.out.println("예외가 발생하면 실행되는 구간, 예외 받는 곳");
			e.printStackTrace(); // 예외가 발생하면 예외 상태를 알려주고 line도 알려주는 기능
		} finally {
			// 마지막으로 꼭 실행되어야하는 구간!
			// 자원을 열고 닫을때 반드시 필요함!
			System.out.println("자원을 정리하는 문장!");
			System.out.println("예외가 발생 하든 안하든 실행되는 구간!");
		}
	}

}
