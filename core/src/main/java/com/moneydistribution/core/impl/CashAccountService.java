package com.moneydistribution.core.impl;

import java.util.List;

import com.moneydistribution.core.api.ICashAccountService;
import com.moneydistribution.domain.CashAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
public class CashAccountService implements ICashAccountService {

	private ICashAccountWarehouse cashAccountWarehouse;

	@Override
	public Long saveOrUpdate(CashAccount cashAccount) {
		return cashAccountWarehouse.saveOrUpdate(cashAccount);
	}

	@Override
	public List<CashAccount> getByUserId(Long id) {
		return cashAccountWarehouse.getByUserId(id);
	}

	public void setCashAccountWarehouse(ICashAccountWarehouse cashAccountWarehouse) {
		this.cashAccountWarehouse = cashAccountWarehouse;
	}

	public interface ICashAccountWarehouse {

		Long saveOrUpdate(CashAccount cashAccount);

		List<CashAccount> getByUserId(Long id);
	}
}
