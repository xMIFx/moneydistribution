package com.moneydistribution.warehouse.whDomain.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER")
public class UserWarehouseDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	private Long id;

	@Column(name = "login", unique = true)
	private String login;

	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<CashAccountWarehouseDTO> cashAccounts;

	public UserWarehouseDTO() {
	}

	public UserWarehouseDTO(Long id,
			String login,
			String password,
			Set<CashAccountWarehouseDTO> cashAccounts) {

		this.id = id;
		this.login = login;
		this.password = password;
		this.cashAccounts = cashAccounts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<CashAccountWarehouseDTO> getCashAccounts() {
		return cashAccounts;
	}

	public void setCashAccounts(Set<CashAccountWarehouseDTO> cashAccounts) {
		this.cashAccounts = cashAccounts;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		UserWarehouseDTO that = (UserWarehouseDTO) o;

		if (!id.equals(that.id)) {
			return false;
		}
		if (!login.equals(that.login)) {
			return false;
		}
		if (!password.equals(that.password)) {
			return false;
		}
		return cashAccounts.equals(that.cashAccounts);
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + login.hashCode();
		result = 31 * result + password.hashCode();
		result = 31 * result + cashAccounts.hashCode();
		return result;
	}
}
