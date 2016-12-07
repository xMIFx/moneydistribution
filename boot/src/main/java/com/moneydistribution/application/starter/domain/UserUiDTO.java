package com.moneydistribution.application.starter.domain;

import java.util.List;

public class UserUiDTO {

    private long id;
    private String login;
    private String password;
    private List<CashAccountUiDTO> cashAccounts;

    public UserUiDTO() {
    }

    public UserUiDTO(long id,
            String password,
            String login,
            List<CashAccountUiDTO> cashAccounts) {

        this.id = id;
        this.login = login;
        this.password = password;
        this.cashAccounts = cashAccounts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public List<CashAccountUiDTO> getCashAccounts() {
        return cashAccounts;
    }

    public void setCashAccounts(List<CashAccountUiDTO> cashAccounts) {
        this.cashAccounts = cashAccounts;
    }
}
