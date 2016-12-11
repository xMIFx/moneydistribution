package com.moneydistribution.warehouse.whDomain.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * Created by Vlad on 25.11.2016.
 */
@Entity
@Table(name = "CASH_ACCOUNT")
public class CashAccountWarehouseDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	private Long id;

	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserWarehouseDTO user;

	@OneToMany(mappedBy = "cashAccount", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<CashSubAccountWarehouseDTO> cashSubAccounts;

	public CashAccountWarehouseDTO() {
	}

	public CashAccountWarehouseDTO(Long id,
			String name,
			UserWarehouseDTO user,
			Set<CashSubAccountWarehouseDTO> cashSubAccounts) {

		this.id = id;
		this.name = name;
		this.user = user;
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

	public UserWarehouseDTO getUserDTOWarehouse() {
		return user;
	}

	public void setUserDTOWarehouse(UserWarehouseDTO user) {
		this.user = user;
	}

	public Set<CashSubAccountWarehouseDTO> getCashSubAccounts() {
		return cashSubAccounts;
	}

	public void setCashSubAccounts(Set<CashSubAccountWarehouseDTO> cashSubAccounts) {
		this.cashSubAccounts = cashSubAccounts;
	}
}
