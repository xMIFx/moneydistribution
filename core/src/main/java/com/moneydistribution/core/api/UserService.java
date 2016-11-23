package com.xMIFx.SEAP.core.api;

import java.util.List;

import com.xMIFx.SEAP.domain.User;

public interface UserService {

	List<User> getAll();

	Long save(User user, String password);
}
