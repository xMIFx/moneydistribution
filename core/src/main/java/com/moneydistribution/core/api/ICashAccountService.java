package com.moneydistribution.core.api;

import java.util.List;

import com.moneydistribution.domain.CashAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
public interface ICashAccountService {

	Long saveOrUpdate(CashAccount cashAccount);

	List<CashAccount> getByUserId(Long id);
}
