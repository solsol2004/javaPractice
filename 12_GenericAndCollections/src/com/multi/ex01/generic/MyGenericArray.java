package com.multi.ex01.generic;

// 제네릭 기반의 배열 Class
public class MyGenericArray <T> {
	// 제네릭이란? Type을 사용자가 외부에서 주입(injection) 시켜 정의하는 문법
	// T는 Type의 약자로 활용, <T>로 외부에서 타입을 주입시켜 내부에 Type으로 대체된다.
	// T는 정해져 있지 않은 상태에서 미리 프로그래밍이 가능하고, 'T'로 안해도 되고 사용자가 정해도 된다. 
	
	private Object[] array;
	private int index = 0;
	
	public MyGenericArray(int size) {
		array = new Object[size];
	}
	
	public int add(T data) { // 나중에 사용자 Type으로 교체될 T
		if(index >= array.length) {
			return -1;
		}
		array[index++] = data;
		return index;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 0 || index >= this.index) {
			return null;
		}
		return (T)array[index];
	}
}
