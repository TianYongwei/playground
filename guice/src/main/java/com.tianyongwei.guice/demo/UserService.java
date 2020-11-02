package com.tianyongwei.guice.demo;

import com.google.inject.Inject;

public class UserService {

  @Inject
  private UserDao userDao;

  public void say() {
    userDao.say();
  }
}
