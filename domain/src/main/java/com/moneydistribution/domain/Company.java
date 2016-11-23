package com.xMIFx.SEAP.domain;

import java.util.List;

public class Company extends User {
	private List<CompanyProject> companyProjects;

	public Company(String login, Long id) {
		super(login, UserType.COMPANY, id);
	}
}
