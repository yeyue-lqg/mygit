package com.nnxy.gitstudy;

public class Student {

	private Integer id;
	private String username;
	private String password;
	private int age;
	private String sex;
	
	public Student(int id,String username,String password,int age,String sex) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.age=age+100;
		this.sex=sex;
	}
	
}
