package com.br.karaoke.api.services.interfaces;

import com.br.karaoke.api.model.User;

public interface IUserService {

	User register(User newUser) throws Exception;

}
