package com.multi.ex01.basic_thread;

public class BasicThread {
	public static void main(String[] args) {
		// 1초를  셀수 있는 프로그램
		
		// Main Thread = main이 실행되는 thread, 프로그램의 실행이 되고 분기가 시작되는 곳
		int second = 0;
		while(true) {
			System.out.println(second + "초입니다.");
			second++;
			
			try {
				Thread.sleep(1000);	// ms, 1000ms = 1초, 1/1000초
				// Sleep을 주면 해당 Thread가 지정한 시간까지 멈추는 기능
				// 현업에서는 가끔 네트워크 처리나 입출력처리가 되지 않을때 sleep을 통해서 해결한다.
				// -> 상대방이 대답할 시간을 주거나 실행할 시간을 줄때 사용
				// 최근에는 nano second도 지원
				Thread.sleep(0,100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
