package com.xMIFx.SEAP.warehouse.whDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER")
public class UserDTOWarehouse {
	protected Long id;
	protected String login;
	protected String password;
	protected int userType;

	public UserDTOWarehouse() {
	}

	public UserDTOWarehouse(Long id, String login, String password, int userType) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.userType = userType;
	}

	public UserDTOWarehouse(String login, String password, int userType) {
		this.login = login;
		this.password = password;
		this.userType = userType;
		this.id = null;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Type(type = "long")
	public Long getId() {
		return id;
	}

	@Column(name = "login", unique = true)
	public String getLogin() {
		return login;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	@Column(name = "userType")
	public int getUserType() {
		return userType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		UserDTOWarehouse that = (UserDTOWarehouse) o;

		if (userType != that.userType) {
			return false;
		}
		if (id != null ? !id.equals(that.id) : that.id != null) {
			return false;
		}
		if (!login.equals(that.login)) {
			return false;
		}
		return password.equals(that.password);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + login.hashCode();
		result = 31 * result + password.hashCode();
		result = 31 * result + userType;
		return result;
	}
}
