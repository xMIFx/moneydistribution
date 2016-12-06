package com.moneydistribution.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashSubAccount {
	private final Long id;
	private final String name;
	private final BigDecimal currentAmount;
	private final BigDecimal increaseAmount;
	private final LocalDate lastUpdate;
	private final LocalDate nextUpdate;
	private final RefreshPeriodType refreshPeriodType;
	private final int refreshPeriods;

	public CashSubAccount(Long id,
			String name,
			BigDecimal currentAmount,
			BigDecimal increaseAmount,
			LocalDate lastUpdate,
			LocalDate nextUpdate,
			RefreshPeriodType refreshPeriodType,
			int refreshPeriods) {
		this.id = id;
		this.name = name;
		this.currentAmount = currentAmount;
		this.increaseAmount = increaseAmount;
		this.lastUpdate = lastUpdate;
		this.nextUpdate = nextUpdate;
		this.refreshPeriodType = refreshPeriodType;
		this.refreshPeriods = refreshPeriods;
	}

	public Long id() {
		return id;
	}


	public String name() {
		return name;
	}

	public BigDecimal currentAmount() {
		return currentAmount;
	}

	public BigDecimal increaseAmount() {
		return increaseAmount;
	}

	public LocalDate nextUpdate() {
		return nextUpdate;
	}

	public LocalDate lastUpdate() {
		return lastUpdate;
	}

	public RefreshPeriodType refreshPeriodType() {
		return refreshPeriodType;
	}

	public int refreshPeriods() {
		return refreshPeriods;
	}

}
