package com.moneydistribution.application.starter.domain;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashSubAccountUiDTO {
	private final Long id;
	private final Long cashAccountId;
	private final String name;
	private final double currentAmount;
	private final double increaseAmount;
	private final long lastUpdate;
	private final long nextUpdate;
	private final String refreshPeriodTypeUiDTO;
	private final int refreshPeriods;

	public CashSubAccountUiDTO(Long id,
			Long cashAccountId,
			String name,
			double currentAmount,
			double increaseAmount,
			long lastUpdate,
			long nextUpdate,
			String refreshPeriodTypeUiDTO,
			int refreshPeriods) {
		this.cashAccountId = cashAccountId;
		this.id = id;
		this.name = name;
		this.currentAmount = currentAmount;
		this.increaseAmount = increaseAmount;
		this.lastUpdate = lastUpdate;
		this.nextUpdate = nextUpdate;
		this.refreshPeriodTypeUiDTO = refreshPeriodTypeUiDTO;
		this.refreshPeriods = refreshPeriods;
	}

	public Long id() {
		return id;
	}

	public Long cashAccountId() {
		return cashAccountId;
	}

	public String name() {
		return name;
	}

	public double currentAmount() {
		return currentAmount;
	}

	public double increaseAmount() {
		return increaseAmount;
	}

	public long nextUpdate() {
		return nextUpdate;
	}

	public long lastUpdate() {
		return lastUpdate;
	}

	public String refreshPeriodType() {
		return refreshPeriodTypeUiDTO;
	}

	public int refreshPeriods() {
		return refreshPeriods;
	}

}
