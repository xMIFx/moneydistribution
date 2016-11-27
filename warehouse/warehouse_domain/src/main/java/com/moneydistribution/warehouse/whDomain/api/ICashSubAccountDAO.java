package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public interface ICashSubAccountDAO {

	Long save(CashSubAccountDTOWarehouse cashAccount);

	List<CashSubAccountDTOWarehouse> getByCashAccountId(Long id);
}
