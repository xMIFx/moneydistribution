package com.moneydistribution.warehouse.whDomain.converters;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.domain.RefreshPeriodType;
import com.moneydistribution.domain.User;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountWarehouseDTO;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountWarehouseDTO;
import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;

/**
 * Created by Vlad on 07.12.2016.
 */
public class WarehouseConverter {

	public UserWarehouseDTO convert(User user) {
		return new UserWarehouseDTO(user.id(), user.login(), user.password(), convertListCashAccounts(user.cashAccounts()));
	}

	public User convert(UserWarehouseDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getLogin(), null, convertListCashAccountDTOs(userDTO.getCashAccounts()));
	}

	public CashAccount convert(CashAccountWarehouseDTO dto) {
		return new CashAccount(dto.getId(), dto.getUserDTOWarehouse().getId(), dto.getName(),
				convertListCashSubAccountDTOs(dto.getCashSubAccounts()));
	}

	public CashAccountWarehouseDTO convert(CashAccount cashAccount) {
		UserWarehouseDTO userDTO = new UserWarehouseDTO();
		userDTO.setId(cashAccount.userId());
		return new CashAccountWarehouseDTO(cashAccount.id(), cashAccount.name(), userDTO,
				convertListCashSubAccounts(cashAccount.cashSubAccounts()));
	}

	public CashSubAccountWarehouseDTO convert(CashSubAccount cashSubAccount) {
		CashAccountWarehouseDTO cashAccountDTO = new CashAccountWarehouseDTO();
		cashAccountDTO.setId(cashSubAccount.cashAccountId());
		return new CashSubAccountWarehouseDTO(cashSubAccount.id(),
				cashSubAccount.name(),
				cashSubAccount.currentAmount().doubleValue(),
				cashSubAccount.increaseAmount().doubleValue(),
				cashSubAccount.lastUpdate().toEpochDay(),
				cashSubAccount.nextUpdate().toEpochDay(),
				cashSubAccount.refreshPeriodType().index(),
				cashSubAccount.refreshPeriods(),
				cashAccountDTO);
	}

	public CashSubAccount convert(CashSubAccountWarehouseDTO dto) {
		return new CashSubAccount(dto.getId(),
				dto.getCashAccount().getId(),
				dto.getName(),
				BigDecimal.valueOf(dto.getCurrentAmount()),
				BigDecimal.valueOf(dto.getIncreaseAmount()),
				LocalDate.ofEpochDay(dto.getLastUpdate()),
				LocalDate.ofEpochDay(dto.getNextUpdate()),
				RefreshPeriodType.byIndex(dto.getRefreshPeriodType()),
				dto.getRefreshPeriods());
	}

	public Set<CashAccountWarehouseDTO> convertListCashAccounts(Collection<CashAccount> cashAccountList) {
		Set<CashAccountWarehouseDTO> listTo = new HashSet<>();
		for (CashAccount cashAccount : cashAccountList) {
			listTo.add(convert(cashAccount));
		}
		return listTo;
	}

	public List<CashAccount> convertListCashAccountDTOs(Collection<CashAccountWarehouseDTO> listFrom) {
		List<CashAccount> listTo = new ArrayList<>();
		for (CashAccountWarehouseDTO cashAccountDTO : listFrom) {
			listTo.add(convert(cashAccountDTO));
		}
		return listTo;
	}

	public Set<CashSubAccountWarehouseDTO> convertListCashSubAccounts(Collection<CashSubAccount> listFrom) {
		Set<CashSubAccountWarehouseDTO> listTo = new HashSet<>();
		for (CashSubAccount cashSubAccount : listFrom) {
			listTo.add(convert(cashSubAccount));
		}
		return listTo;
	}

	public List<CashSubAccount> convertListCashSubAccountDTOs(Collection<CashSubAccountWarehouseDTO> listFrom) {
		List<CashSubAccount> listTo = new ArrayList<>();
		for (CashSubAccountWarehouseDTO cashSubAccountDTO : listFrom) {
			listTo.add(convert(cashSubAccountDTO));
		}
		return listTo;
	}

}
