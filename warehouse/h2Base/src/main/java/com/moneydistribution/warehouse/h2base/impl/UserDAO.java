package com.moneydistribution.warehouse.h2base.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.api.IUserDAO;
import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;

public class UserDAO implements IUserDAO {

	private SessionFactory factory;

	@Override
	public UserWarehouseDTO getById(Long id) {
		UserWarehouseDTO user;
		try (Session session = factory.openSession()) {
			user = (UserWarehouseDTO) session.createCriteria(UserWarehouseDTO.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult();
		}
		return user;
	}

	@Transactional
	@Override
	public Long saveOrUpdate(UserWarehouseDTO user) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(user);
		return user.getId();
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
