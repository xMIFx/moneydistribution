package com.moneydistribution.warehouse.whDomain.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.moneydistribution.core.impl.CashSubAccountService;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.warehouse.whDomain.api.ICashSubAccountDAO;
import com.moneydistribution.warehouse.whDomain.converters.CashSubAccountConverter;
import com.moneydistribution.warehouse.whDomain.converters.CashSubAccountDTOConverter;

/**
 * Created by Vlad on 28.11.2016.
 */
@Component
public class CashSubAccountWarehouse implements CashSubAccountService.ICashSubAccountWarehouse {
	@Resource
	private ICashSubAccountDAO cashSubAccountDAO;

	private CashSubAccountConverter cashSubAccountConverter = new CashSubAccountConverter();
	private CashSubAccountDTOConverter cashSubAccountDTOWarehouse = new CashSubAccountDTOConverter();

	@Override
	public Long save(CashSubAccount cashAccount) {
		return cashSubAccountDAO.save(cashSubAccountConverter.convert(cashAccount));
	}

	@Override
	public List<CashSubAccount> getByCashAccountId(Long id) {
		cashSubAccountConverter.convert(new ArrayList<CashSubAccount>());

		return cashSubAccountDTOWarehouse.convert(cashSubAccountDAO.getByCashAccountId(id));
	}
}
