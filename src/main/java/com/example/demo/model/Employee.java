package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	
	private int id;
    private String name;
    private int age;
    private String title;
    private String dob;
     
     public Employee(int id, String name, int age, String title, String dob) {
 		this.id = id;
 		this.name = name;
 		this.age = age;
 		this.title = title;
 		this.dob = dob;
 	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTitle() {
		return title;
	}

	public String getDob() {
		return dob;
	}
}
