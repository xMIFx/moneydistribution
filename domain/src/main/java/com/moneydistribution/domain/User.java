package com.xMIFx.SEAP.domain;

public abstract class User {
	protected final Long id;
	protected final String login;
	protected final UserType userType;

	public User(String login, UserType userType, Long id) {
		this.login = login;
		this.userType = userType;
		this.id = id;
	}

	public User(String login, UserType userType) {
		this.login = login;
		this.userType = userType;
		this.id = null;
	}

	public UserType getUserType() {
		return userType;
	}

	public Long getId() {

		return id;
	}

	public String getLogin() {
		return login;

	}
}
