package com.moneydistribution.core.api;

import java.util.List;

import com.moneydistribution.domain.User;

public interface UserService {

	List<User> getAll();

	Long save(User user, String password);
}
