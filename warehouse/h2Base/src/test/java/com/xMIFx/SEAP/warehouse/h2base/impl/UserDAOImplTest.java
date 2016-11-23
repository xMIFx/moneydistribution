package com.xMIFx.SEAP.warehouse.h2base.impl;

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

import com.xMIFx.SEAP.warehouse.whDomain.UserDTOWarehouse;
import com.xMIFx.SEAP.warehouse.whDomain.api.UserDAO;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(classes = TestConfiguration.class)
public class UserDAOImplTest {
	@Resource
	UserDAO userDAO;

	@Test
	public void testOneSave() throws Exception {
		Long expected = 1L;
		UserDTOWarehouse user = new UserDTOWarehouse("MIF", "1", 1);

		Long result = userDAO.save(user);

		assertThat(result, is(expected));
	}

	@Test
	public void testSeveralSave() throws Exception {
		Long expected = 1L;
		UserDTOWarehouse user = new UserDTOWarehouse("MIF", "1", 1);

		Long result = userDAO.save(user);

		assertThat(result, is(expected));

		expected = 2L;
		UserDTOWarehouse user2 = new UserDTOWarehouse("MIF1", "11", 2);

		result = userDAO.save(user2);

		assertThat(result, is(expected));
	}

	@Test
	public void testGetById() throws Exception {
		UserDTOWarehouse expected = new UserDTOWarehouse(1L, "MIF", "1", 1);

		UserDTOWarehouse user = new UserDTOWarehouse("MIF", "1", 1);
		userDAO.save(user);

		UserDTOWarehouse result = userDAO.getById(expected.getId());
		assertThat(result, is(expected));
	}

	@Test
	public void testGetAll() throws Exception {
		List<UserDTOWarehouse> expected = new ArrayList<>();
		expected.add(new UserDTOWarehouse(1L, "MIF", "1", 1));
		expected.add(new UserDTOWarehouse(2L, "MIF1", "11", 2));

		userDAO.save(new UserDTOWarehouse("MIF", "1", 1));
		userDAO.save(new UserDTOWarehouse("MIF1", "11", 2));

		List<UserDTOWarehouse> result = userDAO.getAll();
		assertThat(result, is(expected));
	}

}