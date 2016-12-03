package com.moneydistribution.warehouse.h2base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.api.ICashSubAccountDAO;
import com.moneydistribution.warehouse.whDomain.dto.CashSubAccountDTOWarehouse;

/**
 * Created by Vlad on 28.11.2016.
 */
@Repository
public class CashSubAccountDAO implements ICashSubAccountDAO {

	@Resource
	private SessionFactory factory;

	@Transactional
	@Override
	public Long save(CashSubAccountDTOWarehouse cashSubAccount) {
		Session session = factory.getCurrentSession();
		session.save(cashSubAccount);
		return cashSubAccount.id();
	}

	@Override
	public List<CashSubAccountDTOWarehouse> getByCashAccountId(Long id) {
		List<CashSubAccountDTOWarehouse> accounts;
		try (Session session = factory.openSession()) {
			accounts = (List<CashSubAccountDTOWarehouse>) session.createCriteria(CashSubAccountDTOWarehouse.class)
					.add(Restrictions.eq("userId", id)).list();
		}
		return accounts;
	}
}
