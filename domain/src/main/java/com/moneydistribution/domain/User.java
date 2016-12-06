package com.moneydistribution.domain;

import java.util.List;

public class User {
	private final Long id;
	private final String login;
	private final String password;
	private final List<CashAccount> cashAccounts;

	public User(Long id, String login, String password, List<CashAccount> cashAccounts) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.cashAccounts = cashAccounts;
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

	public List<CashAccount> cashAccounts() {
		return cashAccounts;
	}
}
