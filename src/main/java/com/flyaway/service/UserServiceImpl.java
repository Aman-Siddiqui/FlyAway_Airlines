package com.flyaway.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.flyaway.dao.UserDao;
import com.flyaway.model.Admin;
import com.flyaway.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

}
