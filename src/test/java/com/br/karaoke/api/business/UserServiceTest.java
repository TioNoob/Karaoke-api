package com.br.karaoke.api.business;

import org.junit.Test;

import com.br.karaoke.api.repository.LoginRepository;
import com.br.karaoke.api.services.LoginService;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
	
	private LoginService loginBusiness;
	
	public UserServiceTest() {
		LoginRepository loginDAO = new LoginRepository();
		
		loginBusiness = new LoginService();		
		loginBusiness.setLoginDAO(loginDAO);
	}

	@Test
	public void testCheckIfUserNeedsPassword_valid() {
		loginBusiness.checkIfUserNeedsPassword("test");
	}
}
