package com.multi.ex01.basic_thread;

public class BasicThread2 {
	// Thread 생성법 3가지
	// 1. Thread를 상속 받아서 사용하기 -> 설계가 커지고 복잡할때 사용
	// 2. Thread Runnable Interface를 구현하여 사용하기
	// 2.1 - Class에서 직접 구현하기
	// 2.2 - 익명 Class를 사용하는 방법★ 짧은 쓰레드를 만들때 사용한다.

	// ※ 주의 run 호출하는 것은 그냥 메소드 호출이다. Sub Thread 생성하기 위해선 반드시 start를 사용!

	public static void main(String[] args) {
		// 1. Thread를 상속하여 구현하는 방법
		MyThread thread1 = new MyThread("thread1");
//		thread1.run(); // 잘못된 호출!!
		thread1.start(); // 실제 쓰레드를 실행시켜 분기시키는 문장

		// 2.1 Thread Runnable Interface - Class 직접 구현하는 방법
		Thread thread2 = new Thread(new RunnableClass("thread2"));
		thread2.start();

		// 2.2 Thread Runnable Interface - 익명 Class
		new Thread(new Runnable() {
			int count = 0;
			String name = "Thread3";

			@Override
			public void run() {
				while (true) {
					System.out.println(count + "초 입니다. " + name);
					count++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
		System.out.println("Main Thread!");

	}
}
