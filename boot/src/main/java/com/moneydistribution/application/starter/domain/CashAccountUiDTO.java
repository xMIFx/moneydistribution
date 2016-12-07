package com.moneydistribution.application.starter.domain;

import java.util.List;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashAccountUiDTO {
	private Long id;
	private long userId;
	private String name;
	private List<CashSubAccountUiDTO> cashSubAccounts;

	public CashAccountUiDTO() {
	}

	public CashAccountUiDTO(Long id,
			long userId,
			String name,
			List<CashSubAccountUiDTO> cashSubAccounts) {

		this.id = id;
		this.userId = userId;
		this.name = name;
		this.cashSubAccounts = cashSubAccounts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CashSubAccountUiDTO> getCashSubAccounts() {
		return cashSubAccounts;
	}

	public void setCashSubAccounts(List<CashSubAccountUiDTO> cashSubAccounts) {
		this.cashSubAccounts = cashSubAccounts;
	}
}
