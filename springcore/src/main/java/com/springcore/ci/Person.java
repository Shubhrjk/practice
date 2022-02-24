package com.springcore.ci;

public class Person {

	private int personId;
	private String name;
	
	
	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}


	@Override
	public String toString() {
		
		return this.name +" "+ this.personId; 
	}


	
	
}
