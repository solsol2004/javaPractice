package com.multi.practice3.run;

import com.multi.practice3.model.vo.Employee;
import com.multi.practice3.model.vo.Employee_Singleton;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		
		
		System.out.println(e.getEmpNo() + " " + e.getEmpName() + " " + e.getDept() + " " + e.getJob() + " " + e.getAge() + " " + e.getGender() + " " + e.getSalary() + " " + e.getBonusPoint() + " " + e.getPhone() + " " + e.getAddress());		
		
		// 객체를 만들지 않고 가져오는 방법
		// Singleton 패턴 = java에서 유일하게 객체를 존재시키는 방법
		Employee_Singleton e2 = Employee_Singleton.getInstance();
		e2.setEmpName("홍길동");
		System.out.println(e2);
		
	}
}
