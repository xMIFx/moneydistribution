package com.moneydistribution.application.starter.springConfig;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.moneydistribution.application.starter.servlets.MoneyDistributionServlet;
import com.moneydistribution.application.starter.servlets.UserController;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.moneydistribution.application.starter"})
@Import({CoreConfig.class})
public class MvcConfig extends WebMvcConfigurerAdapter {
	@Autowired
	private CoreConfig coreConfig;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webapp/resources/**");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setSuffix(".html");
		return bean;
	}

	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}

	@Bean
	public MoneyDistributionServlet moneyDistributionServlet() {
		MoneyDistributionServlet moneyDistributionServlet = new MoneyDistributionServlet();
		moneyDistributionServlet.setCashAccountService(coreConfig.iCashAccountService());
		moneyDistributionServlet.setCashSubAccountService(coreConfig.iCashSubAccountService());

		return moneyDistributionServlet;
	}

	@Bean
	public UserController userController() {
		UserController userController = new UserController();
		userController.setUserService(coreConfig.iUserService());

		return userController;
	}

}
