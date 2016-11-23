package com.moneydistribution.warehouse.whDomain;

import java.util.ArrayList;
import java.util.List;


import com.moneydistribution.domain.User;

public class WarehouseConverter {

	public static UserDTOWarehouse convert(User user, String password) {
		return new UserDTOWarehouse(user.getId(), user.getLogin(), password);
	}

	public static User convert(UserDTOWarehouse userDTO) {
		 return new User(userDTO.getLogin(), userDTO.getId());
	}

	public static List<User> convert(List<UserDTOWarehouse> userDTO) {
		List<User> users = new ArrayList<User>();
		for (UserDTOWarehouse user : userDTO) {
			users.add(convert(user));
		}
		return users;
	}
}
