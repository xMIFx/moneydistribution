package com.moneydistribution.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.moneydistribution.core.api.ICashAccountService;
import com.moneydistribution.domain.CashAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
@Service
public class CashAccountService implements ICashAccountService {
	@Resource
	private ICashAccountWarehouse cashAccountWarehouse;

	@Override
	public Long save(CashAccount cashAccount) {
		return cashAccountWarehouse.save(cashAccount);
	}

	@Override
	public List<CashAccount> getByUserId(Long id) {
		return cashAccountWarehouse.getByUserId(id);
	}

	public interface ICashAccountWarehouse {

		Long save(CashAccount cashAccount);

		List<CashAccount> getByUserId(Long id);
	}
}
