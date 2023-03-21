package com.multi.ex04.access_modifier;

// 접근 제한자
public class AccessModifier {
	public int 		publicValue; 			//어디서든 사용 가능한 제한자★★★★★
	protected int 	protectedValue;			//상속시 부모자식 + 같은 패키지 내 사용 가능
	int 			defaultValue;			//같은 패키지 내에서 사용 가능 제한자
	private int 	privateValue;			//자기 자신만 사용 가능한 접근 제한자!★★★★★
	
	
	//클래스 내부 = 자신의 영역
	public void myMethod() {
		publicValue = 1;			// O
		protectedValue = 2;			// O
		defaultValue = 3;			// O
		privateValue = 4;			// O
	}
	
}
