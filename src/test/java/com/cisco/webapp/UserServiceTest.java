package com.cisco.webapp;

import static org.junit.Assert.*;
import junit.framework.Assert;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.cisco.doa.UserDao;

public class UserServiceTest {

	@Test
	public void testGetUser() {
		// Test valid id
		UserDao mockUserDao = mock(UserDao.class);
		Users u = new Users();
		u.setName("Manish");
		when(mockUserDao.getUser(anyInt())).thenReturn(u);

		UserService service = new UserService();
		service.setUserDao(mockUserDao);

		// Test id being null
		when(mockUserDao.getUser(null)).thenThrow(
				new IllegalArgumentException("ID cannot be null"));

	}

}
