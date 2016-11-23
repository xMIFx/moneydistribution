package com.moneydistribution.core;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.moneydistribution.core.api.UserService;
import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.api.UserWarehouse;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	UserWarehouse userWarehouse;

	public List<User> getAll() {
		return userWarehouse.getAll();
	}

	public Long save(User user, String password) {
		return userWarehouse.save(user, password);
	}
}
