package com.moneydistribution.warehouse.whDomain.impl;

import com.moneydistribution.core.impl.UserService;
import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.whDomain.api.IUserDAO;
import com.moneydistribution.warehouse.whDomain.converters.WarehouseConverter;

public class UserWarehouse implements UserService.IUserWarehouse {
	private IUserDAO userDAO;

	private final WarehouseConverter convert = new WarehouseConverter();

	@Override
	public Long saveOrUpdate(User user) {
		return userDAO.saveOrUpdate(convert.convert(user));
	}

	@Override
	public User get(String login, String password) {
		return null;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
