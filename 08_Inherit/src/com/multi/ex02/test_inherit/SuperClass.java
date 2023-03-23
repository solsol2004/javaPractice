package com.multi.ex02.test_inherit;

//부모(조상) 클래스
public class SuperClass {
	private int privateValue = 5; // 밖에서 사용 불가!
	protected int protectedValue = 10;
	public int publicValue = 20;
	
	
	public SuperClass() {
		System.out.println("SuperClass의 생성자 입니다");
	}

	public void publicMethod() {
		System.out.println("SuperClass의 publicMethod입니다");
	}

	public int getPrivateValue() {
		return privateValue;
	}


	public void setPrivateValue(int privateValue) {
		this.privateValue = privateValue;
	}
	
	
	
}
