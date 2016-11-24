package com.moneydistribution.warehouse.whDomain;

import java.util.ArrayList;
import java.util.List;

import com.moneydistribution.domain.User;

class WarehouseConverter {

	static UserDTOWarehouse convert(User user, String password) {
		return new UserDTOWarehouse(user.id(), user.login(), user.password());
	}

	static User convert(UserDTOWarehouse userDTO) {
		return new User(userDTO.id(), userDTO.login(), userDTO.password(), cashAccounts);
	}

	static List<User> convert(List<UserDTOWarehouse> userDTO) {
		List<User> users = new ArrayList<User>();
		for (UserDTOWarehouse user : userDTO) {
			users.add(convert(user));
		}
		return users;
	}
}
