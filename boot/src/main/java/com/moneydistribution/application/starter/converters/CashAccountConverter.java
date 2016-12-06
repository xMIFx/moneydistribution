package com.moneydistribution.application.starter.converters;

import com.moneydistribution.application.starter.domain.CashAccountUiDTO;
import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashAccountConverter extends AbstractUIConverter<CashAccount, CashAccountUiDTO> {
	@Override
	public CashAccountUiDTO convert(CashAccount cashAccount) {
		return new CashAccountUiDTO(cashAccount.id(), cashAccount.userId(), cashAccount.name());
	}
}
