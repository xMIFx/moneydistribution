package com.moneydistribution.application.starter.domain;

import java.time.LocalDate;

/**
 * Created by Vlad on 25.11.2016.
 */
public enum RefreshPeriodTypeUiDTO {
	DAY(0) {
		@Override
		LocalDate addTo(LocalDate date, int number) {
			return date.plusDays(number);
		}
	}, WEEK(1) {
		@Override
		LocalDate addTo(LocalDate date, int number) {
			return date.plusWeeks(number);
		}
	}, MONTH(2) {
		@Override
		LocalDate addTo(LocalDate date, int number) {
			return date.plusMonths(number);
		}
	};

	private int index;

	RefreshPeriodTypeUiDTO(int index) {
		this.index = index;
	}

	abstract LocalDate addTo(LocalDate date, int number);

	public int index() {
		return index;
	}

	public static RefreshPeriodTypeUiDTO byIndex(int index) {
		for (RefreshPeriodTypeUiDTO value : RefreshPeriodTypeUiDTO.values()) {
			if (value.index == index) {
				return value;
			}
		}
		throw new IllegalArgumentException("no type for that index: " + index);
	}
}
