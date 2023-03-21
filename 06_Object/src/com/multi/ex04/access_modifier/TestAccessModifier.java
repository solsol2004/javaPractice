package com.multi.ex04.access_modifier;

public class TestAccessModifier {
	public static void main(String[] args) {
		//AccessModifier와 같은 패키지에서 멤버변수 접근 테스크!
		
		AccessModifier test = new AccessModifier();
		test.publicValue = 1;			// public ok
		test.protectedValue = 2;		// protected ok
		test.defaultValue = 3;			// default ok
//		test.privateValue = 4;			// Error!! private로 외부에서 절대 접근 불가!
		// The field AccessModifier.privateValue is not visible: 접근 불가능한 상태!
	}
}
