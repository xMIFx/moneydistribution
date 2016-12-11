package com.moneydistribution.application.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.moneydistribution.application.starter.springConfig.CoreConfig;
import com.moneydistribution.application.starter.springConfig.MvcConfig;
import com.moneydistribution.application.starter.springConfig.SpringSecurityConfig;

@Import({MvcConfig.class, SpringSecurityConfig.class, CoreConfig.class})
@SpringBootApplication
public class MoneyDistrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyDistrApplication.class, args);
	}
}
