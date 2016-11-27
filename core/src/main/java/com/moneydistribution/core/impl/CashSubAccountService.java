package com.moneydistribution.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.moneydistribution.core.api.ICashSubAccountService;
import com.moneydistribution.domain.CashSubAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
@Service
public class CashSubAccountService implements ICashSubAccountService {

	@Resource
	private ICashSubAccountWarehouse cashSubAccountWarehouse;

	@Override
	public Long save(CashSubAccount cashAccount) {
		return cashSubAccountWarehouse.save(cashAccount);
	}

	@Override
	public List<CashSubAccount> getByCashAccountId(Long id) {
		return cashSubAccountWarehouse.getByCashAccountId(id);
	}

	public interface ICashSubAccountWarehouse {

		Long save(CashSubAccount cashAccount);

		List<CashSubAccount> getByCashAccountId(Long id);
	}
}
