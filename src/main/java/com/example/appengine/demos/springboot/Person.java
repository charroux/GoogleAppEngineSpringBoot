package com.example.appengine.demos.springboot;

public class Person {
	
	String name;
	int age;
	String bank;
	
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
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", bank=" + bank + "]";
	}
	
}
