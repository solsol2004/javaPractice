package com.multi.ex04.poly_interface;

public class _Run {
	public static void main(String[] args) {
		// 부모 Type    
		Car[] carArray = new Car[5];
		
		carArray[0] = new Avante();
		carArray[1] = new Sonata();
		carArray[2] = new Grandeur();
		carArray[3] = new Bugatti();
		carArray[4] = new TeslaModel3();

		for(int i = 0; i < carArray.length; i++) {
			printCar(carArray[i]);
		}
	}
	
	public static void printCar(Car car) { // 인자에 부모 Type으로 받고있다.
		System.out.println(car.toString());
		
		car.move();	
		
		if(car instanceof ElectricType) { // 전기차
			((ElectricType)car).charge(); // interface type으로 casting 가능
		}else { // 내연기관차
			car.oilling();
		}
		
		if(car instanceof HyundaiCar) {
			((HyundaiCar)car).nickName();
			((HyundaiCar)car).service();
			System.out.println(((HyundaiCar)car).serviceName);
		}
		
		if(car instanceof Bugatti) {
			((Bugatti)car).nickName();
		}
		
		if(car instanceof OverseasType) {
			((OverseasType)car).origin();
		}
		
		System.out.println("---------------------------------------");
	}
}















