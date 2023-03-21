package com.multi.ex02.object;

//Person의 제대로 된 버전! 이게 표준문법
//ValueObject : VO로 읽고, 데이터만 있는 객체의 표현법, 멤버변수 + getter, setter + 기타(toString)
//VO의 객체에서는 멤버변수를 private로 접근 제한한다.
//이유 : 외부에서 직접 변수로 접근하지 않고, getter /setter로 기능을 제한한다!
//만드는 방법은 자동완성으로 완성시킨다!

//VO 만드는 방법!
//Step 1. 객체에서 사용할 변수를 선언한다. 접근제한자는 private로 통일한다. 올바른 타입을 활용
//Step 2. alt + shift + s 혹은 우클릭 -> Source로 접근하고, 아래부터 자동으로 생성한다.
//		생성자, 필드 있는 생성자, toString, getter/setter 생성한다!
//Step3. 주석 일부를 제거하고 포맷팅을 맞춰준다.
public class PersonVO /*extends Objext*/{// 모든 객체는 Object를 부모로 가진다. 단, 선언하지 않아도 자동 상속
	private String name;
	private int age;
	private String phoneNum;
	private String address;

	
	//인자 없는 생성자
	//super(): 부모의 생성자를 호출하는 키워드
	public PersonVO() {
		super();
	}

	//모든 인자가 있는 생성자, 한번에 초기화 해줄 수 있다!
	public PersonVO(String name, int age, String phoneNum, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	@Override //상속에서 부모 메소드를 재정의할때 사용하는 키워드인데. 어노테이션으로 생략해도 문제 없다.
	// 어노테이션이란? 부가저깅ㄴ 정보를 제공하고 '@'를 통해 컴파일적인 기능을 활용할때 사용하는 문법
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
