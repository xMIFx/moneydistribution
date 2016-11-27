package com.moneydistribution.core.api;

import java.util.List;

import com.moneydistribution.domain.CashSubAccount;

/**
 * Created by Vlad on 26.11.2016.
 */
public interface ICashSubAccountService {

	Long save(CashSubAccount cashAccount);

	List<CashSubAccount> getByCashAccountId(Long id);
}
