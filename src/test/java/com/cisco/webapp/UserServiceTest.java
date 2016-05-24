package com.cisco.webapp;

import static org.junit.Assert.*;
import junit.framework.Assert;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.cisco.doa.UserDao;

public class UserServiceTest {

	@Test(expected = IllegalArgumentException.class)
	public void testGetUser() {
		// Test valid id
		UserDao mockUserDao = mock(UserDao.class);
		Users u = new Users();
		u.setName("Manish");
		when(mockUserDao.getUser(anyInt())).thenReturn(u);

		UserService service = new UserService();
		service.setUserDao(mockUserDao);
		u = service.getUser(1);
		Assert.assertEquals("Manish", u.getName());

		// Test id being null
		when(mockUserDao.getUser(null)).thenThrow(
				new IllegalArgumentException("ID cannot be null"));
		u = service.getUser(null);

	}

}
