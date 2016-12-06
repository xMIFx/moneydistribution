package com.moneydistribution.application.starter.converters;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUIConverter<FROM, TO> {

	public abstract TO convert(FROM from);

	public List<TO> convert(List<FROM> fromList) {
		List<TO> toList = new ArrayList<>();
		for (FROM from : fromList) {
			toList.add(convert(from));
		}
		return toList;
	}

}
