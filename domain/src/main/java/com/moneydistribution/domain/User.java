package com.moneydistribution.domain;

public class User {
	protected final Long id;
	protected final String login;

	public User(String login, Long id) {
		this.login = login;
		this.id = id;
	}

	public Long getId() {

		return id;
	}

	public String getLogin() {
		return login;

	}
}
