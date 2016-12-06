package com.moneydistribution.application.starter.domain;

/**
 * Created by Vlad on 25.11.2016.
 */
public class CashSubAccountUiDTO {
	private Long id;
	private String name;
	private double currentAmount;
	private double increaseAmount;
	private long lastUpdate;
	private long nextUpdate;
	private String refreshPeriodType;
	private int refreshPeriods;

	public CashSubAccountUiDTO() {
	}

	public CashSubAccountUiDTO(Long id,
			String name,
			double currentAmount,
			double increaseAmount,
			long lastUpdate,
			long nextUpdate,
			String refreshPeriodType,
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

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public double getIncreaseAmount() {
		return increaseAmount;
	}

	public void setIncreaseAmount(double increaseAmount) {
		this.increaseAmount = increaseAmount;
	}

	public long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public long getNextUpdate() {
		return nextUpdate;
	}

	public void setNextUpdate(long nextUpdate) {
		this.nextUpdate = nextUpdate;
	}

	public String getRefreshPeriodType() {
		return refreshPeriodType;
	}

	public void setRefreshPeriodTypeUiDTO(String refreshPeriodType) {
		this.refreshPeriodType = refreshPeriodType;
	}

	public int getRefreshPeriods() {
		return refreshPeriods;
	}

	public void setRefreshPeriods(int refreshPeriods) {
		this.refreshPeriods = refreshPeriods;
	}
}
