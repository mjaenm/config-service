package com.everis.bootcamp.app.web;

import reactor.core.publisher.Flux;

public class Person {
	private String firstname;
	private String lastname;
	private Integer age;

	public Person(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void addAttribute(String string, Flux<Person> personlist) {
		// TODO Auto-generated method stub
		
	}

}
