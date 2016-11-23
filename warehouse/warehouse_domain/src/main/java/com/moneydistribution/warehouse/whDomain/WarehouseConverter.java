package com.xMIFx.SEAP.warehouse.whDomain;

import java.util.ArrayList;
import java.util.List;

import com.xMIFx.SEAP.domain.Company;
import com.xMIFx.SEAP.domain.Person;
import com.xMIFx.SEAP.domain.User;
import com.xMIFx.SEAP.domain.UserType;

public class WarehouseConverter {

	public static UserDTOWarehouse convert(User user, String password) {
		return new UserDTOWarehouse(user.getId(), user.getLogin(), password, user.getUserType().getId());
	}

	public static User convert(UserDTOWarehouse userDTO) {
		UserType userType = UserType.getById(userDTO.getUserType());
		if (userType == UserType.PERSON) {
			return new Person(userDTO.getLogin(), userDTO.getId());
		} else {
			return new Company(userDTO.getLogin(), userDTO.getId());
		}
	}

	public static List<User> convert(List<UserDTOWarehouse> userDTO) {
		List<User> users = new ArrayList<User>();
		for (UserDTOWarehouse user : userDTO) {
			users.add(convert(user));
		}
		return users;
	}
}
