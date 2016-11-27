package com.moneydistribution.warehouse.whDomain.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * Created by Vlad on 25.11.2016.
 */

@Entity
@Table(name = "CASH_SUB_ACCOUNT")
public class CashSubAccountDTOWarehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	private final Long id;

	@Column(name = "cashAccountId")
	@Type(type = "long")
	private final Long cashAccountId;

	@Column(name = "name")
	private final String name;

	@Column(name = "currentAmount")
	@Type(type = "double")
	private final double currentAmount;

	@Column(name = "increaseAmount")
	@Type(type = "double")
	private final double increaseAmount;

	@Column(name = "lastUpdate")
	@Type(type = "long")
	private final long lastUpdate;

	@Column(name = "nextUpdate")
	@Type(type = "long")
	private final long nextUpdate;

	@Column(name = "refreshPeriodType")
	private final int refreshPeriodType;

	@Column(name = "refreshPeriods")
	private final int refreshPeriods;

	public CashSubAccountDTOWarehouse(Long id, Long cashAccountId, String name,
			double currentAmount,
			double increaseAmount,
			long lastUpdate,
			long nextUpdate,
			int refreshPeriodType,
			int refreshPeriods) {
		this.cashAccountId = cashAccountId;
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

	public long lastUpdate() {
		return lastUpdate;
	}

	public long nextUpdate() {
		return nextUpdate;
	}

	public int refreshPeriodType() {
		return refreshPeriodType;
	}

	public int refreshPeriods() {
		return refreshPeriods;
	}

}
