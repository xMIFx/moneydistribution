package com.moneydistribution.warehouse.whDomain.converters;

import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashAccountConverter extends AbstractWarehouseConverter<CashAccount, CashAccountDTOWarehouse> {
	@Override
	public CashAccountDTOWarehouse convert(CashAccount cashAccount) {
		return new CashAccountDTOWarehouse(cashAccount.id(), cashAccount.userId(), cashAccount.name());
	}
}
