package com.moneydistribution.application.starter.servlets;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.moneydistribution.core.api.ICashAccountService;

/**
 * Created by Vlad on 29.11.2016.
 */
@Controller
public class MoneyDistributionServlet {
	@Resource
	ICashAccountService cashAccountService;

	@RequestMapping("/")
	String home() {
		return "index";
	}

	@GET
	@Path("login")
	@Produces(MediaType.TEXT_PLAIN)
	public String login() {
		return "index";
	}

	@RequestMapping("/logOut")
	String logout() {
		return "index";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.PUT)
	String registration() {
		return "index";
	}

	@RequestMapping("/myCashAccounts")
	String myAccounts() {
		return "index";
	}

	@RequestMapping("/myCashSubAccounts")
	String mySubAccounts() {
		return "index";
	}

	@RequestMapping(value = "/cshAccount", method = RequestMethod.PUT)
	String addCashAccount() {
		return "index";
	}

	@RequestMapping(value = "/cashAccount", method = RequestMethod.POST)
	String updateCashAccount() {
		return "index";
	}

	@RequestMapping(value = "/cashAccount", method = RequestMethod.DELETE)
	String removeCashAccount() {
		return "index";
	}

	@RequestMapping(value = "/cashSubAccount", method = RequestMethod.PUT)
	String addCashSubAccount() {
		return "index";
	}

	@RequestMapping(value = "/cashSubAccount", method = RequestMethod.POST)
	String updateCashSubAccount() {
		return "index";
	}

	@RequestMapping(value = "/cashSubAccount", method = RequestMethod.DELETE)
	String removeCashSubAccount() {
		return "index";
	}
}
