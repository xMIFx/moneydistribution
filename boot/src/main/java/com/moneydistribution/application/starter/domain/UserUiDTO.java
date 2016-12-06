package com.moneydistribution.application.starter.domain;

public class UserUiDTO {

    private final long id;
    private final String name;

    public UserUiDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
