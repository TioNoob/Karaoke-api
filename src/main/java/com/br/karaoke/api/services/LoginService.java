package com.br.karaoke.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.karaoke.api.model.User;
import com.br.karaoke.api.model.command.FilterUserCommand;
import com.br.karaoke.api.repository.interfaces.ILoginRepository;
import com.br.karaoke.api.services.interfaces.ILoginService;

@Service
public class LoginService implements ILoginService {

	//private static final Logger log = LoggerFactory.getLogger(LoginService.class);
	private ILoginRepository loginDAO;

	@Autowired
	public void setLoginDAO(ILoginRepository loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public boolean checkIfUserNeedsPassword(String userName) {
		FilterUserCommand filters = new FilterUserCommand(userName);

		User recoveredUser = loginDAO.get(filters);

		return recoveredUser != null;
	}

}
