package com.moneydistribution.core.impl;

import com.moneydistribution.core.api.IUserService;
import com.moneydistribution.domain.User;

public class UserService implements IUserService {

	private IUserWarehouse userWarehouse;

	public Long saveOrUpdate(User user) {
		return userWarehouse.saveOrUpdate(user);
	}

	@Override
	public User get(String login, String password) {
		return userWarehouse.get(login, password);
	}

	public void setUserWarehouse(IUserWarehouse userWarehouse) {
		this.userWarehouse = userWarehouse;
	}

	public interface IUserWarehouse {

		Long saveOrUpdate(User user);

		User get(String login, String password);
	}

}
