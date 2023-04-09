package com.multi.ex01.exception;

import java.io.IOException;

public class UseThrows {
	// throws : 예외가 발생하면 호출한 메소드에게 예외의 책임을 전가하는 키워드
	//          단, main에서 발생시에는 프로그램 종료를 의미
	
	// throw : 예외를 만들어서 던지는 문장
	
	public static void method() throws IOException {
		System.out.println("예외 발생 전");
		if(true) {
			throw new IOException("Test");
		}
		System.out.println("예외 발생 후");
	}
	
	public static void main(String[] args) throws IOException {
		method();
	}
	
}
