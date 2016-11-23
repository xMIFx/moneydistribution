package com.xMIFx.SEAP.warehouse.whDomain.api;

import java.util.List;

import com.xMIFx.SEAP.warehouse.whDomain.UserDTOWarehouse;

public interface UserDAO {
	UserDTOWarehouse getById(Long id);

	List<UserDTOWarehouse> getAll();

	Long save(UserDTOWarehouse user);

}
