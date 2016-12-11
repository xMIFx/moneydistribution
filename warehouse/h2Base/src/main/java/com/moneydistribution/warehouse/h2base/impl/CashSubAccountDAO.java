package com.moneydistribution.warehouse.h2base.impl;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.api.ICashSubAccountDAO;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountWarehouseDTO;

/**
 * Created by Vlad on 28.11.2016.
 */
public class CashSubAccountDAO implements ICashSubAccountDAO {

	private SessionFactory factory;

	@Transactional
	@Override
	public Long saveOrUpdate(CashSubAccountWarehouseDTO cashSubAccount) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(cashSubAccount);
		return cashSubAccount.getId();
	}

	@Override
	public List<CashSubAccountWarehouseDTO> getByCashAccountId(Long id) {
		List<CashSubAccountWarehouseDTO> accounts;
		try (Session session = factory.openSession()) {
			accounts = (List<CashSubAccountWarehouseDTO>) session.createCriteria(CashSubAccountWarehouseDTO.class)
					.add(Restrictions.eq("userId", id)).list();
		}
		return accounts;
	}

	@Override
	public Collection<CashSubAccountWarehouseDTO> getByNextTimeForUpdate(long nextUpdate) {
		Collection<CashSubAccountWarehouseDTO> accounts;
		try (Session session = factory.openSession()) {
			accounts = (Collection<CashSubAccountWarehouseDTO>) session.createCriteria(CashSubAccountWarehouseDTO.class)
					.add(Restrictions.eq("nextUpdate", nextUpdate)).list();
		}
		return accounts;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
