package com.moneydistribution.warehouse.whDomain.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.core.impl.CashAccountService;
import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.warehouse.whDomain.api.ICashAccountDAO;
import com.moneydistribution.warehouse.whDomain.converters.CashAccountConverter;
import com.moneydistribution.warehouse.whDomain.converters.CashAccountDTOConverter;

/**
 * Created by Vlad on 28.11.2016.
 */
@Component
public class CashAccountWarehouse implements CashAccountService.ICashAccountWarehouse {
	@Resource
	private ICashAccountDAO cashAccountDAO;

	private CashAccountConverter cashAccountConverter = new CashAccountConverter();
	private CashAccountDTOConverter cashAccountDTOWarehouse = new CashAccountDTOConverter();

	@Override
	public Long save(CashAccount cashAccount) {
		return cashAccountDAO.save(cashAccountConverter.convert(cashAccount));
	}

	@Override
	public List<CashAccount> getByUserId(Long id) {
		return cashAccountDTOWarehouse.convert(cashAccountDAO.getByUserId(id));
	}
}
