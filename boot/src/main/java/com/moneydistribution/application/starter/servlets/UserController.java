package com.moneydistribution.application.starter.servlets;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.Collections;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moneydistribution.application.starter.domain.UserUiDTO;
import com.moneydistribution.core.api.IUserService;

/**
 * Created by Vlad on 05.12.2016.
 */

@RequestMapping("/user")
public class UserController {

	private IUserService userService;

	@RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	public
	@ResponseBody
	UserUiDTO login(@RequestParam("name") String name, @RequestParam("password") String password) {
		return new UserUiDTO(0L, "bbb", "ddd", Collections.emptyList());
	}

	@RequestMapping("/logOut")
	public String logout() {
		return "index";
	}

	@RequestMapping(produces = APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	@ResponseBody
	public UserUiDTO registration() {
		return new UserUiDTO(0L, "bbb", "ddd", Collections.emptyList());
	}

	@RequestMapping(produces = APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@ResponseBody
	public UserUiDTO update() {
		return new UserUiDTO(0L, "bbb", "ddd", Collections.emptyList());
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
