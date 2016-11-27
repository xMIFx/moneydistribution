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
@Table(name = "CASH_ACCOUNT")
public class CashAccountDTOWarehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	private final Long id;

	@Column(name = "userId")
	@Type(type = "long")
	private final Long userId;

	@Column(name = "name")
	private final String name;

	public CashAccountDTOWarehouse(Long id, Long userId, String name) {
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
