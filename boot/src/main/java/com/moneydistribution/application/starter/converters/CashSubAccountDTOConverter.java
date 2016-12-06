package com.moneydistribution.application.starter.converters;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.moneydistribution.application.starter.domain.CashSubAccountUiDTO;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.domain.RefreshPeriodType;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public class CashSubAccountDTOConverter extends AbstractUIConverter<CashSubAccountUiDTO, CashSubAccount> {
	@Override
	public CashSubAccount convert(CashSubAccountUiDTO dto) {
		return new CashSubAccount(dto.id(),
				dto.cashAccountId(),
				dto.name(),
				BigDecimal.valueOf(dto.currentAmount()),
				BigDecimal.valueOf(dto.increaseAmount()),
				LocalDate.ofEpochDay(dto.lastUpdate()),
				LocalDate.ofEpochDay(dto.nextUpdate()),
				RefreshPeriodType.valueOf(dto.refreshPeriodType()),
				dto.refreshPeriods());
	}
}
