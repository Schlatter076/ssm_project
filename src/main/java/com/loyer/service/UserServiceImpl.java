package com.loyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loyer.dao.UserDao;
import com.loyer.domain.User;

@Service
public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserDao userDao;

  @Override
  public User selectUserById(Integer userId) {
    return userDao.selectUserById(userId);
  }
  

}
