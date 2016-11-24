package com.moneydistribution.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashSubAccount {
	private final String name;
	private final BigDecimal currentAmount;
	private final BigDecimal increaseAmount;
	private final LocalDate lastUpdate;
	private final LocalDate nextUpdate;
	private final RefreshPeriodType refreshPeriodType;
	private final int refreshPeriods;

	public CashSubAccount(String name,
			BigDecimal currentAmount,
			BigDecimal increaseAmount,
			LocalDate lastUpdate,
			RefreshPeriodType refreshPeriodType,
			int refreshPeriods) {
		this.name = name;
		this.currentAmount = currentAmount;
		this.increaseAmount = increaseAmount;
		this.refreshPeriodType = refreshPeriodType;
		this.refreshPeriods = refreshPeriods;
		this.lastUpdate = lastUpdate;
		this.nextUpdate = refreshPeriodType.addTo(lastUpdate, refreshPeriods);
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

	public LocalDate lastUpdate() {
		return lastUpdate;
	}

	public LocalDate extUpdate() {
		return nextUpdate;
	}

	public RefreshPeriodType refreshPeriod() {
		return refreshPeriodType;
	}

	public int refreshPeriods() {
		return refreshPeriods;
	}
}
