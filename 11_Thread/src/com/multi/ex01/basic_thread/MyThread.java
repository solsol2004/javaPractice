package com.multi.ex01.basic_thread;

// 1초씩 샐수있는 thread
public class MyThread extends Thread{
	private int count = 0;
	
	public MyThread(String name) {
		super(name);
	}

	// thread 로직을 포함하는 메소드 -> 호출하면 thread로 실행되지 않음!!
	@Override
	public void run() {
		while(true) {
			System.out.println(count+ "초입니다." + getName());
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
