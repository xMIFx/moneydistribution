package com.moneydistribution.warehouse.whDomain.api;

import java.util.Collection;
import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountWarehouseDTO;

/**
 * Created by Vlad on 27.11.2016.
 */
public interface ICashSubAccountDAO {

	Long saveOrUpdate(CashSubAccountWarehouseDTO cashAccount);

	Collection<CashSubAccountWarehouseDTO> getByCashAccountId(Long id);

	Collection<CashSubAccountWarehouseDTO> getByNextTimeForUpdate(long l);
}
