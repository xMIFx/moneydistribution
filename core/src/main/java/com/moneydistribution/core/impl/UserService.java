package com.moneydistribution.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.moneydistribution.core.api.IUserService;
import com.moneydistribution.domain.User;

@Service
public class UserService implements IUserService {
	@Resource
	private IUserWarehouse userWarehouse;

	public List<User> getAll() {
		return userWarehouse.getAll();
	}

	public Long save(User user, String password) {
		return userWarehouse.save(user, password);
	}

	@Override
	public User get(Long id) {
		return userWarehouse.get(id);
	}

	@Override
	public User get(String login, String password) {
		return userWarehouse.get(login, password);
	}

	public interface IUserWarehouse {

		List<User> getAll();

		Long save(User user, String password);

		User get(Long id);

		User get(String login, String password);
	}

}
