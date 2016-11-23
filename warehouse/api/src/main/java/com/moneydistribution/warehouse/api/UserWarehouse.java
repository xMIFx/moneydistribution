package com.moneydistribution.warehouse.api;

import java.util.List;

import com.moneydistribution.domain.User;

public interface UserWarehouse {
	User getById(Long id);

	List<User> getAll();

	Long save(User user, String password);
}
