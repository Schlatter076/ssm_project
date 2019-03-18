package com.loyer.service;

import com.loyer.domain.User;

public interface UserService {

  User selectUserById(Integer userId);
}
