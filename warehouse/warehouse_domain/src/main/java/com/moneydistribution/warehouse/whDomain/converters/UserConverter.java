package com.moneydistribution.warehouse.whDomain.converters;

import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.whDomain.dto.UserDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class UserConverter extends AbstractWarehouseConverter<User, UserDTOWarehouse> {
	@Override
	public UserDTOWarehouse convert(User from) {
		return new UserDTOWarehouse(from.id(), from.login(), from.password());
	}
}
