package com.moneydistribution.application.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.moneydistribution.application.starter.springConfig.JerseyConfig;
import com.moneydistribution.application.starter.springConfig.MvcConfig;
import com.moneydistribution.application.starter.springConfig.SpringSecurityConfig;
import com.moneydistribution.warehouse.h2base.impl.springConfig.DataBaseConfig;

@Import({MvcConfig.class, SpringSecurityConfig.class, DataBaseConfig.class})
@SpringBootApplication
public class MoneyDistrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyDistrApplication.class, args);
	}
}
