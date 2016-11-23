package com.xMIFx.SEAP.domain;

public class Person extends User {
	public Person(String login, Long id) {
		super(login, UserType.PERSON, id);
	}
	public Person(String login) {
		super(login, UserType.PERSON);
	}
}
