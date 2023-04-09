package com.multi.ex02.collections_list;

// Comparable : 정렬을 지원하는 Interface
public class User1 implements Comparable<User1> {
	private String id;
	private String name;
	private int age;
	private double account; // 계좌 잔액

	public User1() {
		super();
	}

	public User1(String id, String name, int age, double account) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.account = account;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", age=" + age + ", account=" + account + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}
	
	// 객체 비교시 정렬 기준을 정하는 메소드
	@Override
	public int compareTo(User1 o) {
		// ID 기준으로 오름차순 정렬해보기
//		return id.compareTo(o.getId()); // compareTo : 작으면 -1, 같으면 0, 크면 +1
		// ID 기준으로 내림차순 정렬해보기
		return o.getId().compareTo(id); // compareTo : 작으면 -1, 같으면 0, 크면 +1
	}


}
