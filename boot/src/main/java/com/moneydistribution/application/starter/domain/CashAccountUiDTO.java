package com.moneydistribution.application.starter.domain;

import java.util.List;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashAccountUiDTO {
	private Long id;
	private String name;
	private List<CashSubAccountUiDTO> cashSubAccounts;

	public CashAccountUiDTO() {
	}

	public CashAccountUiDTO(Long id, String name, List<CashSubAccountUiDTO> cashSubAccounts) {
		this.id = id;
		this.name = name;
		this.cashSubAccounts = cashSubAccounts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
