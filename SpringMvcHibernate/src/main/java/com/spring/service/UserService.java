package com.spring.service;

import com.spring.model.Login;
import com.spring.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
