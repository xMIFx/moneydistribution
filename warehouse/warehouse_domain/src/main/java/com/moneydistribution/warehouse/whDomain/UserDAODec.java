package com.moneydistribution.warehouse.whDomain;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.api.UserWarehouse;
import com.moneydistribution.warehouse.whDomain.api.UserDAO;

@Component
public class UserDAODec implements UserWarehouse {
	@Resource
	UserDAO userDAO;

	@Override
	public User getById(Long id) {
		return WarehouseConverter.convert(userDAO.getById(id));
	}

	@Override
	public List<User> getAll() {
		return WarehouseConverter.convert(userDAO.getAll());
	}

	@Override
	public Long save(User user, String password) {
		return userDAO.save(WarehouseConverter.convert(user, password));
	}
}
