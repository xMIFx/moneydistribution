package com.moneydistribution.domain;

public class User {
	private final Long id;
	private final String login;
	private final String password;

	public User(Long id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public Long id() {
		return id;
	}

	public String login() {
		return login;
	}

	public String password() {
		return password;
	}

}
