package com.multi.ex04.access_modifier2;

import com.multi.ex04.access_modifier.AccessModifier;

public class TestAccessModifier {
	public static void main(String[] args) {
		//다른 패키지 테스트!
		
		AccessModifier test = new AccessModifier();
		test.publicValue = 1;			// public ok
//		test.protectedValue = 2;		// protected NG!
//		test.defaultValue = 3;			// default NG!TestAccessModifier.java
//		test.privateValue = 4;			// Error!! private로 외부에서 절대 접근 불가!
		// The field AccessModifier.privateValue is not visible: 접근 불가능한 상태!
	}
}
