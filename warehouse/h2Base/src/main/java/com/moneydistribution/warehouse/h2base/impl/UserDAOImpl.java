package com.moneydistribution.warehouse.h2base.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.UserDTOWarehouse;
import com.moneydistribution.warehouse.whDomain.api.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Resource
	private SessionFactory factory;

	public UserDTOWarehouse getById(Long id) {
		UserDTOWarehouse user;
		try (Session session = factory.openSession()) {
			user = (UserDTOWarehouse) session.createCriteria(UserDTOWarehouse.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult();
		}
		return user;
	}

	public List<UserDTOWarehouse> getAll() {
		List<UserDTOWarehouse> users;

		try (Session session = factory.openSession()) {
			users = (List<UserDTOWarehouse>) session.createCriteria(UserDTOWarehouse.class).list();
		}
		return users;
	}

	@Transactional
	public Long save(UserDTOWarehouse user) {
		Session session = factory.getCurrentSession();
		session.save(user);
		return user.id();
	}

}
