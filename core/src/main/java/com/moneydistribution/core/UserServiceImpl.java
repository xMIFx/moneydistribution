package com.xMIFx.SEAP.core;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xMIFx.SEAP.core.api.UserService;
import com.xMIFx.SEAP.domain.User;
import com.xMIFx.SEAP.warehouse.api.UserWarehouse;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	UserWarehouse userWarehouse;

	public List<User> getAll() {
		return userWarehouse.getAll();
	}

	public Long save(User user, String password) {
		return userWarehouse.save(user, password);
	}
}
