package com.moneydistribution.warehouse.whDomain.converters;

import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashAccountDTOConverter extends AbstractWarehouseConverter<CashAccountDTOWarehouse, CashAccount> {
	@Override
	public CashAccount convert(CashAccountDTOWarehouse dto) {
		return new CashAccount(dto.id(), dto.userId(), dto.name(), cashSubAccounts);
	}
}
