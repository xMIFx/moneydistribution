package com.moneydistribution.warehouse.h2base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;
import com.moneydistribution.warehouse.whDomain.api.IUserDAO;

@Repository
public class UserDAO implements IUserDAO {

	@Resource
	private SessionFactory factory;

	public UserWarehouseDTO getById(Long id) {
		UserWarehouseDTO user;
		try (Session session = factory.openSession()) {
			user = (UserWarehouseDTO) session.createCriteria(UserWarehouseDTO.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult();
		}
		return user;
	}

	public List<UserWarehouseDTO> getAll() {
		List<UserWarehouseDTO> users;

		try (Session session = factory.openSession()) {
			users = (List<UserWarehouseDTO>) session.createCriteria(UserWarehouseDTO.class).list();
		}
		return users;
	}

	@Transactional
	public Long save(UserWarehouseDTO user) {
		Session session = factory.getCurrentSession();
		session.save(user);
		return user.id();
	}

}
