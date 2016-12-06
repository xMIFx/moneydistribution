package com.moneydistribution.application.starter.converters;

import com.moneydistribution.application.starter.domain.UserUiDTO;
import com.moneydistribution.domain.User;

/**
 * Created by Vlad on 27.11.2016.
 */
public class UserDTOConverter extends AbstractUIConverter<UserUiDTO, User> {
	@Override
	public User convert(UserUiDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), "bbb");
	}
}
