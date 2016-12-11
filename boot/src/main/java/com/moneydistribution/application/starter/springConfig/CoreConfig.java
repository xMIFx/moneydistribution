package com.moneydistribution.application.starter.springConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.moneydistribution.core.api.ICashAccountService;
import com.moneydistribution.core.api.ICashSubAccountService;
import com.moneydistribution.core.api.IUserService;
import com.moneydistribution.core.impl.CashAccountService;
import com.moneydistribution.core.impl.CashSubAccountService;
import com.moneydistribution.core.impl.UserService;
import com.moneydistribution.core.job.CashSubAccountUpdateJob;
import com.moneydistribution.core.job.IUpdateJob;

/**
 * Created by Vlad on 12.12.2016.
 */
@Configuration
@EnableScheduling
@Import({WarehouseConfig.class})
@ComponentScan(basePackages = {"com.moneydistribution.core"})
public class CoreConfig {
	@Autowired
	private WarehouseConfig warehouseConfig;

	@Bean
	public IUpdateJob cashSubAccountUpdateJob() {
		CashSubAccountUpdateJob job = new CashSubAccountUpdateJob();
		job.setWarehouse(warehouseConfig.needUpdateCashSubAccountWarehouse());
		return job;
	}

	@Bean
	public ICashAccountService iCashAccountService() {
		CashAccountService cashAccountService = new CashAccountService();
		cashAccountService.setCashAccountWarehouse(warehouseConfig.iCashAccountWarehouse());
		return cashAccountService;
	}

	@Bean
	public ICashSubAccountService iCashSubAccountService() {
		CashSubAccountService cashSubAccountService = new CashSubAccountService();
		cashSubAccountService.setCashSubAccountWarehouse(warehouseConfig.iCashSubAccountWarehouse());
		return cashSubAccountService;
	}

	@Bean
	public IUserService iUserService() {
		UserService userService = new UserService();
		userService.setUserWarehouse(warehouseConfig.iUserWarehouse());
		return userService;
	}
}


