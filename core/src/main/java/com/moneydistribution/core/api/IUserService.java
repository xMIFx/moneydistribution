package com.moneydistribution.core.api;

import com.moneydistribution.domain.User;

public interface IUserService {

	Long saveOrUpdate(User user);

	User get(String login, String password);
}
