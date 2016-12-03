package com.moneydistribution.warehouse.h2base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.api.ICashAccountDAO;
import com.moneydistribution.warehouse.whDomain.dto.CashAccountDTOWarehouse;

/**
 * Created by Vlad on 28.11.2016.
 */
@Repository
public class CashAccountDAO implements ICashAccountDAO {

	@Resource
	private SessionFactory factory;

	@Transactional
	@Override
	public Long save(CashAccountDTOWarehouse cashAccount) {
		Session session = factory.getCurrentSession();
		session.save(cashAccount);
		return cashAccount.id();
	}

	@Override
	public List<CashAccountDTOWarehouse> getByUserId(Long id) {
		List<CashAccountDTOWarehouse> accounts;
		try (Session session = factory.openSession()) {
			accounts = (List<CashAccountDTOWarehouse>) session.createCriteria(CashAccountDTOWarehouse.class)
					.add(Restrictions.eq("userId", id)).list();
		}
		return accounts;
	}
}
