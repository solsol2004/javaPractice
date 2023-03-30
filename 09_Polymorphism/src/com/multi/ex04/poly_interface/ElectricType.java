package com.multi.ex04.poly_interface;


// interface란? 주로 코드간의 규격 또는 Type 통일을 위해 활용되는 문법
public interface ElectricType {
	// public static을 생략가능하나 표준적이지 않다.
//	String GAS_TYPE = "전기";
//	void charge(); // 충전 기능

	// 표준적인 문법
	public static String GAS_TYPE = "전기";
	public abstract void charge(); // 충전 기능
	
}
