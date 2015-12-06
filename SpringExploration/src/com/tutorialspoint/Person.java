package com.tutorialspoint;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	private void setName(String name){
		this.name = name;
	}
	
	private void setAge(int age){
		this.age = age;
	}
	
	private void setGender(String gender){
		this.gender = gender;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getGender(){
		return gender;
	}
}
