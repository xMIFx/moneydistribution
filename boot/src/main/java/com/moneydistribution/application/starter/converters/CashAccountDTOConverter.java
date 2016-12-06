package com.moneydistribution.application.starter.converters;

import com.moneydistribution.application.starter.domain.CashAccountUiDTO;
import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashAccountDTOConverter extends AbstractUIConverter<CashAccountUiDTO, CashAccount> {
	@Override
	public CashAccount convert(CashAccountUiDTO dto) {
		return new CashAccount(dto.id(), dto.userId(), dto.name());
	}
}
