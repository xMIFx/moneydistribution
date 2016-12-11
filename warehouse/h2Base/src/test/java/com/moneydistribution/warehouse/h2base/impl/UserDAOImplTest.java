package com.moneydistribution.warehouse.h2base.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moneydistribution.warehouse.whDomain.api.IUserDAO;
import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(classes = TestConfiguration.class)
public class UserDAOImplTest {

	@Resource
	private IUserDAO userDAO;

	@Test
	public void testOneSave() throws Exception {
		Long expected = 1L;
		UserWarehouseDTO user = new UserWarehouseDTO(null, "MIF", "1", Collections.emptySet());

		Long result = userDAO.saveOrUpdate(user);

		assertThat(result, is(expected));
	}

	@Test
	public void testSeveralSave() throws Exception {
		Long expected = 1L;
		UserWarehouseDTO user = new UserWarehouseDTO(null, "MIF", "1", Collections.emptySet());

		Long result = userDAO.saveOrUpdate(user);

		assertThat(result, is(expected));

		expected = 2L;
		UserWarehouseDTO user2 = new UserWarehouseDTO(null, "MIF1", "11", Collections.emptySet());

		result = userDAO.saveOrUpdate(user2);

		assertThat(result, is(expected));
	}

	@Test
	public void testGetById() throws Exception {
		UserWarehouseDTO expected = new UserWarehouseDTO(1L, "MIF", "1", Collections.emptySet());

		UserWarehouseDTO user = new UserWarehouseDTO(null, "MIF", "1", Collections.emptySet());
		userDAO.saveOrUpdate(user);

		UserWarehouseDTO result = userDAO.getById(expected.getId());
		assertThat(result, is(expected));
	}

	@Test
	public void testGetAll() throws Exception {
		List<UserWarehouseDTO> expected = new ArrayList<>();
		expected.add(new UserWarehouseDTO(1L, "MIF", "1", Collections.emptySet()));
		expected.add(new UserWarehouseDTO(2L, "MIF1", "11", Collections.emptySet()));

		userDAO.saveOrUpdate(new UserWarehouseDTO(null, "MIF", "1", Collections.emptySet()));
		userDAO.saveOrUpdate(new UserWarehouseDTO(null, "MIF1", "11", Collections.emptySet()));

		List<UserWarehouseDTO> result = new ArrayList<>();
		result.add(userDAO.getById(1L));
		result.add(userDAO.getById(2L));

		assertThat(result, is(expected));
	}

}