package com.br.karaoke.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.karaoke.api.dto.InsertUserDTO;
import com.br.karaoke.api.model.User;
import com.br.karaoke.api.services.interfaces.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/user")
	public User register(@RequestBody InsertUserDTO newUserDTO) throws Exception {
		User newUser = Convert(newUserDTO);
		
		return userService.register(newUser);
	}

	private User Convert(InsertUserDTO newUserDTO) {
		return new User(newUserDTO.getName(), newUserDTO.getTableNumber());
	}
}
