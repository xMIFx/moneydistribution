package com.moneydistribution.warehouse.whDomain.converters;

import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.whDomain.dto.UserDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class UserDTOConverter extends AbstractWarehouseConverter<UserDTOWarehouse, User> {
	@Override
	public User convert(UserDTOWarehouse userDTOWarehouse) {
		return new User(userDTOWarehouse.id(), userDTOWarehouse.login(), userDTOWarehouse.password());
	}
}
