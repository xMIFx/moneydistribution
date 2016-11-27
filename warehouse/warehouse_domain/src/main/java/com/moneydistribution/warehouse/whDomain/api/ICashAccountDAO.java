package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 27.11.2016.
 */
public interface ICashAccountDAO {

	Long save(CashAccountDTOWarehouse cashAccount);

	List<CashAccountDTOWarehouse> getByUserId(Long id);
}
