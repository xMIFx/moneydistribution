package com.moneydistribution.core.job;

import java.time.LocalDate;
import java.util.List;

import com.moneydistribution.domain.CashSubAccount;

/**
 * Created by Vlad on 10.12.2016.
 */

public class CashSubAccountUpdateJob implements IUpdateJob {

	private NeedUpdateCashSubAccountWarehouse warehouse;

	@Override
	public void updateCashSubAccounts() {

	}

	public interface NeedUpdateCashSubAccountWarehouse {
		List<CashSubAccount> needUpdate(LocalDate dateOfUpdate);
	}

	public void setWarehouse(NeedUpdateCashSubAccountWarehouse warehouse) {
		this.warehouse = warehouse;
	}
}
