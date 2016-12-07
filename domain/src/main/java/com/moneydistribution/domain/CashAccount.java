package com.moneydistribution.domain;

import java.util.List;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashAccount {
	private final Long id;
	private final long userId;
	private final String name;
	private final List<CashSubAccount> cashSubAccounts;

	public CashAccount(Long id, Long userId, String name, List<CashSubAccount> cashSubAccounts) {
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.cashSubAccounts = cashSubAccounts;
	}

	public String name() {
		return name;
	}

	public Long id() {
		return id;
	}

	public List<CashSubAccount> cashSubAccounts() {
		return cashSubAccounts;
	}

	public Long userId() {
		return userId;
	}
}
