package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.UserDTOWarehouse;

public interface UserDAO {
	UserDTOWarehouse getById(Long id);

	List<UserDTOWarehouse> getAll();

	Long save(UserDTOWarehouse user);

}
