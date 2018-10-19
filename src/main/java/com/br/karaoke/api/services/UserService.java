package com.br.karaoke.api.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.br.karaoke.api.model.User;
import com.br.karaoke.api.repository.interfaces.UserRepository;
import com.br.karaoke.api.services.interfaces.IUserService;

@Service
public class UserService implements IUserService {

	private UserRepository userRepository;
	
	@Override
	public User register(User newUser) throws Exception {
		isValid(newUser);
		
		return userRepository.save(newUser);
	}

	private void isValid(User newUser) throws Exception {
		if(newUser == null) {
			throw new Exception("Usu�rio inv�lido");
		}
		
		if(StringUtils.isEmpty(newUser.getName())) {
			throw new Exception("O nome do usu�rio � obrigat�rio");
		}
		
		if(newUser.getTableNumber() == null) {
			throw new Exception("A mesa do usu�rio � obrigat�ria");
		}
	}

}
