package com.moneydistribution.warehouse.whDomain.impl;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.core.impl.CashSubAccountService;
import com.moneydistribution.core.job.CashSubAccountUpdateJob;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.warehouse.whDomain.api.ICashSubAccountDAO;
import com.moneydistribution.warehouse.whDomain.converters.WarehouseConverter;

/**
 * Created by Vlad on 28.11.2016.
 */
public class CashSubAccountWarehouse implements CashSubAccountService.ICashSubAccountWarehouse,
		CashSubAccountUpdateJob.NeedUpdateCashSubAccountWarehouse {

	private ICashSubAccountDAO cashSubAccountDAO;

	private final WarehouseConverter convert = new WarehouseConverter();

	@Override
	public Long saveOrUpdate(CashSubAccount cashAccount) {
		return cashSubAccountDAO.saveOrUpdate(convert.convert(cashAccount));
	}

	@Override
	public List<CashSubAccount> getByCashAccountId(Long id) {
		return convert.convertListCashSubAccountDTOs(cashSubAccountDAO.getByCashAccountId(id));
	}

	@Override
	public List<CashSubAccount> needUpdate(LocalDate dateOfUpdate) {
		return convert.convertListCashSubAccountDTOs(cashSubAccountDAO.getByNextTimeForUpdate(dateOfUpdate.toEpochDay()));
	}

	public void setCashSubAccountDAO(ICashSubAccountDAO cashSubAccountDAO) {
		this.cashSubAccountDAO = cashSubAccountDAO;
	}
}
