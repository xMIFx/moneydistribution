package com.xMIFx.SEAP.warehouse.api;

import java.util.List;

import com.xMIFx.SEAP.domain.User;

public interface UserWarehouse {
	User getById(Long id);

	List<User> getAll();

	Long save(User user, String password);
}
