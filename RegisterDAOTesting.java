package com.keane.training.testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.RegisterDAO;
import com.keane.training.domain.User;
import com.keane.training.web.handlers.RegisterUser;

public class RegisterDAOTesting {

	RegisterDAO dao = mock(RegisterDAO.class);
	// RegisterUser service = mock(RegisterUser.class);

	@Before
	public void beforeMethod() {
		dao = new RegisterDAO();
	}

	@After
	public void afterMethod() {
		dao = null;

	}

	@Test
	public void testRegister() {
		int expected = 1;
		User u1 = new User(10001, "Shankar5656", "Shankar13", "Shankar@gmail.com", 34, "9999944444", "Haveri",
				"Karnataka", 676767);
		String type = "customer";
		int actual = 0;
		try {
			actual = dao.registerUser(u1, type);
		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected, actual);
		try {
			when(dao.registerUser(u1, type)).thenReturn(1);
		} catch (DAOAppException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
