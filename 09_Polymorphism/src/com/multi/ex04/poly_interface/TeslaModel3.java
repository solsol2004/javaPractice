package com.multi.ex04.poly_interface;

// 전기차 브랜드 + 외제차 - 중국 // Inteface만 다중상속됨
public class TeslaModel3 extends Car implements OverseasType, ElectricType{

	public TeslaModel3() {
		super(175);
	}
	
	@Override
	public void oilling() {
		charge();
	}

	@Override
	public void charge() {
		System.out.println("전기를 충전합니다.");
	}

	@Override
	public void origin() {
		System.out.println("Made in china");
	}

}
