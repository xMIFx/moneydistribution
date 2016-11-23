package com.xMIFx.SEAP.domain;

public enum UserType {
	PERSON(1), COMPANY(2);
	int id;

	UserType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static UserType getById(int id) {
		for (UserType type :
				UserType.values()) {
			if (type.getId() == id) {
				return type;
			}
		}
		throw new IllegalArgumentException();
	}
}
