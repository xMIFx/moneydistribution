package com.moneydistribution.application.starter.servlets;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moneydistribution.application.starter.domain.UserUiDTO;

@Controller
@RequestMapping("/users")
public class HelloWorldController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	public
	@ResponseBody
	UserUiDTO sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		return new UserUiDTO(counter.incrementAndGet(), String.format(template, name));
	}

}
