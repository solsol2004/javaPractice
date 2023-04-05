package com.multi.ex03.poly_abstract;

public class _Run {
	public static void main(String[] args) {
		// 부모 Type
		Car[] carArray = new Car[4];
		
//		carArray[0] = new Car(1000); // 이름 없는 자동차
		carArray[0] = new Avante();
		carArray[1] = new Sonata();
		carArray[2] = new Grandeur();
		carArray[3] = new Bugatti();
		
		for(int i = 0; i <carArray.length; i++) {
			printCar(carArray[i]);
			
		}
	}
	
	public static void printCar(Car car) { // 인자에 부모 type으로 받고있다.
		System.out.println(car.toString());
		
		car.move(); // 동적 바인딩: 실행전에 호출된 메소드를 특정하지 않고, 실행 도중에 실시간(동적)으로 호출되는 메소드가 정해지는 기법
		car.oilling();
		
		if(car instanceof HyundaiCar) {
			((HyundaiCar)car).nickName();
			((HyundaiCar)car).service();
			System.out.println(((HyundaiCar)car).serviceName);
		}
		
		System.out.println("---------------------------------------------");
	}
}
