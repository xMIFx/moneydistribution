package com.xMIFx.SEAP.warehouse.api;

import java.io.Serializable;
import java.util.List;

public interface AbstractWarehouse<T, ID extends Serializable> {

	T getById(ID id);

	List<T> getAll();

	ID save(T t);
}
