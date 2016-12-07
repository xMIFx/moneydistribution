package com.moneydistribution.application.starter.converters;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moneydistribution.application.starter.domain.CashAccountUiDTO;
import com.moneydistribution.application.starter.domain.CashSubAccountUiDTO;
import com.moneydistribution.application.starter.domain.UserUiDTO;
import com.moneydistribution.domain.CashAccount;
import com.moneydistribution.domain.CashSubAccount;
import com.moneydistribution.domain.RefreshPeriodType;
import com.moneydistribution.domain.User;

/**
 * Created by Vlad on 07.12.2016.
 */
public class UiConverter {

	public UserUiDTO convert(User user) {
		return new UserUiDTO(user.id(),
				user.password(),
				user.login(),
				convertListCashAccounts(user.cashAccounts()));
	}

	public User convert(UserUiDTO userDTO) {
		return new User(userDTO.getId(),
				userDTO.getLogin(),
				userDTO.getPassword(),
				convertListCashAccountDTOs(userDTO.getCashAccounts()));
	}

	public CashAccount convert(CashAccountUiDTO dto) {
		return new CashAccount(dto.getId(),
				dto.getUserId(),
				dto.getName(),
				convertListCashSubAccountDTOs(dto.getCashSubAccounts()));
	}

	public CashAccountUiDTO convert(CashAccount cashAccount) {
		return new CashAccountUiDTO(cashAccount.id(),
				cashAccount.userId(),
				cashAccount.name(),
				convertListCashSubAccounts(cashAccount.cashSubAccounts()));
	}

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

	public CashSubAccount convert(CashSubAccountUiDTO dto) {
		return new CashSubAccount(dto.getId(),
				dto.getCashAccoutId(),
				dto.getName(),
				BigDecimal.valueOf(dto.getCurrentAmount()),
				BigDecimal.valueOf(dto.getIncreaseAmount()),
				LocalDate.ofEpochDay(dto.getLastUpdate()),
				LocalDate.ofEpochDay(dto.getNextUpdate()),
				RefreshPeriodType.valueOf(dto.getRefreshPeriodType()),
				dto.getRefreshPeriods());
	}

	private List<CashAccountUiDTO> convertListCashAccounts(List<CashAccount> cashAccountList) {
		List<CashAccountUiDTO> listTo = new ArrayList<>();
		for (CashAccount cashAccount : cashAccountList) {
			listTo.add(convert(cashAccount));
		}
		return listTo;
	}

	private List<CashAccount> convertListCashAccountDTOs(List<CashAccountUiDTO> listFrom) {
		List<CashAccount> listTo = new ArrayList<>();
		for (CashAccountUiDTO cashAccountDTO : listFrom) {
			listTo.add(convert(cashAccountDTO));
		}
		return listTo;
	}

	private List<CashSubAccountUiDTO> convertListCashSubAccounts(List<CashSubAccount> listFrom) {
		List<CashSubAccountUiDTO> listTo = new ArrayList<>();
		for (CashSubAccount cashSubAccount : listFrom) {
			listTo.add(convert(cashSubAccount));
		}
		return listTo;
	}

	private List<CashSubAccount> convertListCashSubAccountDTOs(List<CashSubAccountUiDTO> listFrom) {
		List<CashSubAccount> listTo = new ArrayList<>();
		for (CashSubAccountUiDTO cashSubAccountDTO : listFrom) {
			listTo.add(convert(cashSubAccountDTO));
		}
		return listTo;
	}

}
