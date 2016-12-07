package com.moneydistribution.warehouse.whDomain.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.core.impl.UserService;
import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.whDomain.api.IUserDAO;

@Component
public class UserWarehouse implements UserService.IUserWarehouse {
	@Resource
	private IUserDAO userDAO;

	private UserConverter userConverter = new UserConverter();
	private UserDTOConverter userDTOConverter = new UserDTOConverter();

	@Override
	public List<User> getAll() {
		return userDTOConverter.convert(userDAO.getAll());
	}

	@Override
	public Long save(User user, String password) {
		return userDAO.save(userConverter.convert(user));
	}

	@Override
	public User get(Long id) {
		return null;
	}

	@Override
	public User get(String login, String password) {
		return null;
	}
}
