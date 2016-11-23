package com.xMIFx.SEAP.warehouse.whDomain;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.xMIFx.SEAP.warehouse.whDomain.api.UserDAO;
import com.xMIFx.SEAP.domain.User;
import com.xMIFx.SEAP.warehouse.api.UserWarehouse;

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
