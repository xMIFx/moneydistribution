package com.moneydistribution.warehouse.whDomain.api;

import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;

public interface IUserDAO {
	UserWarehouseDTO getById(Long id);

	Long saveOrUpdate(UserWarehouseDTO user);

}
