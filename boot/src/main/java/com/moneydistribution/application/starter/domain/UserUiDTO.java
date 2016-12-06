package com.moneydistribution.application.starter.domain;

import java.util.List;

public class UserUiDTO {

    private long id;
    private String name;
    private List<CashAccountUiDTO> cashAccounts;

    public UserUiDTO() {
    }

    public UserUiDTO(long id, String name, List<CashAccountUiDTO> cashAccounts) {
        this.id = id;
        this.name = name;
        this.cashAccounts = cashAccounts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CashAccountUiDTO> getCashAccounts() {
        return cashAccounts;
    }

    public void setCashAccounts(List<CashAccountUiDTO> cashAccounts) {
        this.cashAccounts = cashAccounts;
    }
}
