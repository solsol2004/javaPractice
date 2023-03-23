package com.multi.ex02.test_inherit;

// 자식 클래스 부모 SuperClass를 상속한 클래스
public class ChildClass extends SuperClass {
	// 멤버 변수명 겹쳐도 사용 가능!
	
	private int privateValue = 105; // 밖에서 사용 불가!
	protected int protectedValue = 110;
	public int publicValue = 120;
	
	public ChildClass() {
		super(); // 부모의 생성자 호출, 생략해도 자동으로 생성된다.
				 // 상속된 클래스의 생성 순서, 부모 -> 자식
		System.out.println("ChildClass의 생성자입니다.");
		
		// 제일 좋은 방법! 변수명을 다르게 구성할것을 권장
		// Local 변수
		int publicValue = 300;
		
		// 본인의 멤버변수 출력
		System.out.println("My privateValue : " + this.privateValue);
		System.out.println("My protectedValue : " + this.protectedValue);
		System.out.println("My publicValue : " + this.publicValue);
		System.out.println("Local publicValue : " + publicValue);
		
		// 부모의 멤버변수 출력
		System.out.println("Super privateValue : " + super.getPrivateValue());
		System.out.println("Super protectedValue : " + super.protectedValue);
		System.out.println("Super publicValue : " + super.publicValue);
	}
	
	
	
	
	@Override // 오버라이드 됬다고 알려주는 어노테이션, 없어도 문제없음!
	public void publicMethod() {
		System.out.println("ChildClass에서 오버라이드된 publicMethod입니다.");
		super.publicMethod(); //필요하지 않으면 없애도 된다!
	}
}
