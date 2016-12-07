package com.moneydistribution.warehouse.whDomain.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * Created by Vlad on 25.11.2016.
 */

@Entity
@Table(name = "CASH_SUB_ACCOUNT")
public class CashSubAccountWarehouseDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "currentAmount")
	@Type(type = "double")
	private double currentAmount;

	@Column(name = "increaseAmount")
	@Type(type = "double")
	private double increaseAmount;

	@Column(name = "lastUpdate")
	@Type(type = "long")
	private long lastUpdate;

	@Column(name = "nextUpdate")
	@Type(type = "long")
	private long nextUpdate;

	@Column(name = "refreshPeriodType")
	private int refreshPeriodType;

	@Column(name = "refreshPeriods")
	private int refreshPeriods;

	@ManyToOne
	@JoinColumn(name = "cash_account_id")
	private CashAccountWarehouseDTO cashAccount;

	public CashSubAccountWarehouseDTO() {
	}

	public CashSubAccountWarehouseDTO(Long id,
			String name,
			double currentAmount,
			double increaseAmount,
			long lastUpdate,
			long nextUpdate,
			int refreshPeriodType,
			int refreshPeriods,
			CashAccountWarehouseDTO cashAccount) {

		this.id = id;
		this.name = name;
		this.currentAmount = currentAmount;
		this.increaseAmount = increaseAmount;
		this.lastUpdate = lastUpdate;
		this.nextUpdate = nextUpdate;
		this.refreshPeriodType = refreshPeriodType;
		this.refreshPeriods = refreshPeriods;
		this.cashAccount = cashAccount;
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

	public int getRefreshPeriodType() {
		return refreshPeriodType;
	}

	public void setRefreshPeriodType(int refreshPeriodType) {
		this.refreshPeriodType = refreshPeriodType;
	}

	public int getRefreshPeriods() {
		return refreshPeriods;
	}

	public void setRefreshPeriods(int refreshPeriods) {
		this.refreshPeriods = refreshPeriods;
	}

	public CashAccountWarehouseDTO getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(CashAccountWarehouseDTO cashAccount) {
		this.cashAccount = cashAccount;
	}
}
