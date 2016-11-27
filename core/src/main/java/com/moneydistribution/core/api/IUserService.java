package com.moneydistribution.core.api;

import java.util.List;

import com.moneydistribution.domain.User;

public interface IUserService {

	List<User> getAll();

	Long save(User user, String password);

	User get(Long id);

	User get(String login, String password);
}
