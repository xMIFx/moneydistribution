package com.moneydistribution.warehouse.h2base.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moneydistribution.warehouse.whDomain.dto.UserWarehouseDTO;
import com.moneydistribution.warehouse.whDomain.api.IUserDAO;
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
		UserWarehouseDTO user = new UserWarehouseDTO(null, "MIF", "1");

		Long result = userDAO.save(user);

		assertThat(result, is(expected));
	}

	@Test
	public void testSeveralSave() throws Exception {
		Long expected = 1L;
		UserWarehouseDTO user = new UserWarehouseDTO(null,"MIF", "1");

		Long result = userDAO.save(user);

		assertThat(result, is(expected));

		expected = 2L;
		UserWarehouseDTO user2 = new UserWarehouseDTO(null,"MIF1", "11");

		result = userDAO.save(user2);

		assertThat(result, is(expected));
	}

	@Test
	public void testGetById() throws Exception {
		UserWarehouseDTO expected = new UserWarehouseDTO(1L, "MIF", "1");

		UserWarehouseDTO user = new UserWarehouseDTO(null,"MIF", "1");
		userDAO.save(user);

		UserWarehouseDTO result = userDAO.getById(expected.id());
		assertThat(result, is(expected));
	}

	@Test
	public void testGetAll() throws Exception {
		List<UserWarehouseDTO> expected = new ArrayList<>();
		expected.add(new UserWarehouseDTO(1L, "MIF", "1"));
		expected.add(new UserWarehouseDTO(2L, "MIF1", "11"));

		userDAO.save(new UserWarehouseDTO(null,"MIF", "1"));
		userDAO.save(new UserWarehouseDTO(null,"MIF1", "11"));

		List<UserWarehouseDTO> result = userDAO.getAll();
		assertThat(result, is(expected));
	}

}