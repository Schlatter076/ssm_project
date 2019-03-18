package com.loyer.dao;

import com.loyer.domain.User;

public interface UserDao {

  public User selectUserById(Integer userId);
}
