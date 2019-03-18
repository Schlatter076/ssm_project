package com.loyer.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.loyer.baseTest.SpringTestCase;
import com.loyer.domain.User;

public class UserServiceTest extends SpringTestCase {
  
  @Autowired  
  private UserServiceImpl userService;  
  Logger logger = Logger.getLogger(UserServiceTest.class);  
    
  @Test  
  public void selectUserByIdTest(){  
      User user = userService.selectUserById(10);  
      logger.debug("查找结果" + user);  
  }

}
