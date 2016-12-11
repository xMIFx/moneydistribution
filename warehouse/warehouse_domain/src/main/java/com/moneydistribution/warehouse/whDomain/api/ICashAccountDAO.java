package com.moneydistribution.warehouse.whDomain.api;

import java.util.List;

import com.moneydistribution.warehouse.whDomain.dto.CashAccountWarehouseDTO;

/**
 * Created by Vlad on 27.11.2016.
 */
public interface ICashAccountDAO {

	Long saveOrUpdate(CashAccountWarehouseDTO cashAccount);

	List<CashAccountWarehouseDTO> getByUserId(Long id);
}
