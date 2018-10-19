package com.br.karaoke.api.controller;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.karaoke.api.services.interfaces.ILoginService;

@RestController
public class LoginController {

	private ILoginService loginBusiness;

	@Autowired
	public void setLoginBusiness(ILoginService loginBusiness) {
		this.loginBusiness = loginBusiness;
	}

	@PostMapping(name = "/login/checks/needs/password")
	public boolean checkIfUserNeedsPassword(@RequestParam(required = true) String userName) {
		return loginBusiness.checkIfUserNeedsPassword(userName);
	}
	
	@CrossOrigin
	@GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }

}
