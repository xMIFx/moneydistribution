package com.moneydistribution.domain;

import java.util.List;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashAccount {
	private final String name;
	private final List<CashSubAccount> subAccounts;

	public CashAccount(String name, List<CashSubAccount> subAccounts) {
		this.name = name;
		this.subAccounts = subAccounts;
	}

	public String name() {
		return name;
	}

	public List<CashSubAccount> subAccounts() {
		return subAccounts;
	}
}
