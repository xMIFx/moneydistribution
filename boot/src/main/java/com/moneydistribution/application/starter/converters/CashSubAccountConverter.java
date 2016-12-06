package com.moneydistribution.application.starter.converters;

import com.moneydistribution.application.starter.domain.CashSubAccountUiDTO;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashSubAccountConverter extends AbstractUIConverter<CashSubAccount, CashSubAccountUiDTO> {
	@Override
	public CashSubAccountUiDTO convert(CashSubAccount cashSubAccount) {
		return new CashSubAccountUiDTO(cashSubAccount.id(),
				cashSubAccount.cashAccountId(),
				cashSubAccount.name(),
				cashSubAccount.currentAmount().doubleValue(),
				cashSubAccount.increaseAmount().doubleValue(),
				cashSubAccount.lastUpdate().toEpochDay(),
				cashSubAccount.nextUpdate().toEpochDay(),
				cashSubAccount.refreshPeriodType().name(),
				cashSubAccount.refreshPeriods());
	}
}
