package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;

public interface IUserDAO {
	UserWarehouseDTO getById(Long id);

	List<UserWarehouseDTO> getAll();

	Long save(UserWarehouseDTO user);

}
