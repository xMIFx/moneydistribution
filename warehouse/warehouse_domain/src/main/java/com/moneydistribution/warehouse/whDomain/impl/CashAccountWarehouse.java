package com.moneydistribution.warehouse.whDomain.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.core.impl.CashAccountService;
import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.api.ICashAccountDAO;
import com.moneydistribution.warehouse.whDomain.converters.WarehouseConverter;

/**
 * Created by Vlad on 28.11.2016.
 */
public class CashAccountWarehouse implements CashAccountService.ICashAccountWarehouse {
	private ICashAccountDAO cashAccountDAO;

	private final WarehouseConverter warehouseConverter = new WarehouseConverter();
	@Override
	public Long saveOrUpdate(CashAccount cashAccount) {
		return cashAccountDAO.saveOrUpdate(warehouseConverter.convert(cashAccount));
	}

	@Override
	public List<CashAccount> getByUserId(Long id) {
		return warehouseConverter.convertListCashAccountDTOs(cashAccountDAO.getByUserId(id));
	}

	public void setCashAccountDAO(ICashAccountDAO cashAccountDAO) {
		this.cashAccountDAO = cashAccountDAO;
	}
}
