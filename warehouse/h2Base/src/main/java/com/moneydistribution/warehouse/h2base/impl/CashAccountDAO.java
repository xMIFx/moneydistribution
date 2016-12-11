package com.moneydistribution.warehouse.h2base.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.api.ICashAccountDAO;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountWarehouseDTO;

/**
 * Created by Vlad on 28.11.2016.
 */
public class CashAccountDAO implements ICashAccountDAO {

	private SessionFactory factory;

	@Transactional
	@Override
	public Long saveOrUpdate(CashAccountWarehouseDTO cashAccount) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(cashAccount);
		return cashAccount.getId();
	}

	@Override
	public List<CashAccountWarehouseDTO> getByUserId(Long id) {
		List<CashAccountWarehouseDTO> accounts;
		try (Session session = factory.openSession()) {
			accounts = (List<CashAccountWarehouseDTO>) session.createCriteria(CashAccountWarehouseDTO.class)
					.add(Restrictions.eq("userId", id)).list();
		}
		return accounts;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
