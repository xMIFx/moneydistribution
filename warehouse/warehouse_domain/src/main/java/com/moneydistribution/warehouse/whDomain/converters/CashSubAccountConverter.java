package com.moneydistribution.warehouse.whDomain.converters;

import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashSubAccountConverter extends AbstractWarehouseConverter<CashSubAccount, CashSubAccountDTOWarehouse> {
	@Override
	public CashSubAccountDTOWarehouse convert(CashSubAccount cashSubAccount) {
		return new CashSubAccountDTOWarehouse(cashSubAccount.id(),
				cashSubAccount.cashAccountId(),
				cashSubAccount.name(),
				cashSubAccount.currentAmount().doubleValue(),
				cashSubAccount.increaseAmount().doubleValue(),
				cashSubAccount.lastUpdate().toEpochDay(),
				cashSubAccount.nextUpdate().toEpochDay(),
				cashSubAccount.refreshPeriodType().index(),
				cashSubAccount.refreshPeriods());
	}
}
