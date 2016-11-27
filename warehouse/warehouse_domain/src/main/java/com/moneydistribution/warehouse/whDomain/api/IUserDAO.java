package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.UserDTOWarehouse;

public interface IUserDAO {
	UserDTOWarehouse getById(Long id);

	List<UserDTOWarehouse> getAll();

	Long save(UserDTOWarehouse user);

}
