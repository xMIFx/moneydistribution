package com.moneydistribution.application.starter.domain;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashAccountUiDTO {
	private final Long id;
	private final Long userId;
	private final String name;

	public CashAccountUiDTO(Long id, Long userId, String name) {
		this.id = id;
		this.userId = userId;
		this.name = name;
	}

	public String name() {
		return name;
	}

	public Long id() {
		return id;
	}

	public Long userId() {
		return userId;
	}
}
