package com.moneydistribution.application.starter.springConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.moneydistribution.core.impl.CashAccountService;
import com.moneydistribution.core.impl.CashSubAccountService;
import com.moneydistribution.core.impl.UserService;
import com.moneydistribution.core.job.CashSubAccountUpdateJob;
import com.moneydistribution.warehouse.whDomain.impl.CashAccountWarehouse;
import com.moneydistribution.warehouse.whDomain.impl.CashSubAccountWarehouse;
import com.moneydistribution.warehouse.whDomain.impl.UserWarehouse;

@Configuration
@ComponentScan(value = {"com.moneydistribution.warehouse.whDomain.impl"})
@Import({DataBaseConfig.class})
public class WarehouseConfig {
	@Autowired
	private DataBaseConfig dataBaseConfig;

	@Bean
	public CashSubAccountService.ICashSubAccountWarehouse iCashSubAccountWarehouse() {
		return cashSubAccountWarehouse();
	}

	@Bean
	public CashSubAccountUpdateJob.NeedUpdateCashSubAccountWarehouse needUpdateCashSubAccountWarehouse() {
		return cashSubAccountWarehouse();
	}

	@Bean
	CashSubAccountWarehouse cashSubAccountWarehouse() {
		CashSubAccountWarehouse cashSubAccountWarehouse = new CashSubAccountWarehouse();
		cashSubAccountWarehouse.setCashSubAccountDAO(dataBaseConfig.iCashSubAccountDAO());
		return cashSubAccountWarehouse;
	}

	@Bean
	public CashAccountService.ICashAccountWarehouse iCashAccountWarehouse() {
		CashAccountWarehouse cashAccountWarehouse = new CashAccountWarehouse();
		cashAccountWarehouse.setCashAccountDAO(dataBaseConfig.iCashAccountDAO());
		return cashAccountWarehouse;
	}

	@Bean
	public UserService.IUserWarehouse iUserWarehouse() {
		UserWarehouse userWarehouse = new UserWarehouse();
		userWarehouse.setUserDAO(dataBaseConfig.iUserDAO());
		return userWarehouse;
	}
}
