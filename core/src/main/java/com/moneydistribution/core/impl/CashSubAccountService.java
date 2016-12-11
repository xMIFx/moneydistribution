package com.moneydistribution.core.impl;

import java.util.List;

import com.moneydistribution.core.api.ICashSubAccountService;
import com.moneydistribution.domain.CashSubAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
public class CashSubAccountService implements ICashSubAccountService {

	private ICashSubAccountWarehouse cashSubAccountWarehouse;

	@Override
	public Long saveOrUpdate(CashSubAccount cashAccount) {
		return cashSubAccountWarehouse.saveOrUpdate(cashAccount);
	}

	@Override
	public List<CashSubAccount> getByCashAccountId(Long id) {
		return cashSubAccountWarehouse.getByCashAccountId(id);
	}

	public void setCashSubAccountWarehouse(ICashSubAccountWarehouse cashSubAccountWarehouse) {
		this.cashSubAccountWarehouse = cashSubAccountWarehouse;
	}

	public interface ICashSubAccountWarehouse {

		Long saveOrUpdate(CashSubAccount cashAccount);

		List<CashSubAccount> getByCashAccountId(Long id);
	}
}
