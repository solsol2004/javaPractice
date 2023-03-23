package com.multi.ex03.overriding_test2;

import com.multi.ex03.overriding_test.SuperClass;

public class OtherChildClass extends SuperClass{
	//외부 클래스 상속 테스트
	//결과 : private, final, default 상속 불가!
	
	
	@Override
	public void publicMethod() { // 이게 주로 상속되는 패턴
		super.publicMethod();
	}
	
	@Override
	protected void protectedMethod() { // 외부에서 접근하기 위해선 결국 public으로 바꿔야함
		super.protectedMethod();
	}
}
