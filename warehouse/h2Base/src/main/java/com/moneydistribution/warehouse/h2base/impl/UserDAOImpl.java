package com.xMIFx.SEAP.warehouse.h2base.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xMIFx.SEAP.warehouse.whDomain.UserDTOWarehouse;
import com.xMIFx.SEAP.warehouse.whDomain.api.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Resource
	private SessionFactory factory;

	public UserDTOWarehouse getById(Long id) {
		UserDTOWarehouse user = null;
		try (Session session = factory.openSession()) {
			user = (UserDTOWarehouse) session.createCriteria(UserDTOWarehouse.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult();
		}
		return user;
	}

	public List<UserDTOWarehouse> getAll() {
		List<UserDTOWarehouse> users = null;

		try (Session session = factory.openSession()) {
			users = (List<UserDTOWarehouse>) session.createCriteria(UserDTOWarehouse.class).list();
		}
		if (users == null) {
			users = new ArrayList<>();
		}
		return users;
	}

	@Transactional
	public Long save(UserDTOWarehouse user) {
		if (user.getId() != null) {
			return user.getId();
		}
		Session session = factory.getCurrentSession();
		session.save(user);
		return user.getId();
	}

}
