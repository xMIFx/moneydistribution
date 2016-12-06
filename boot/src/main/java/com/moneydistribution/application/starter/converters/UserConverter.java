package com.moneydistribution.application.starter.converters;

import com.moneydistribution.application.starter.domain.UserUiDTO;
import com.moneydistribution.domain.User;

/**
 * Created by Vlad on 27.11.2016.
 */
public class UserConverter extends AbstractUIConverter<User, UserUiDTO> {
	@Override
	public UserUiDTO convert(User user) {
		return new UserUiDTO(user.id(), user.login());
	}
}
