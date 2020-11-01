package com.tianyongwei.java8.guice;

import com.google.inject.Inject;

public class UserService {

  @Inject
  private UserDao userDao;

  public void say() {
    userDao.say();
  }
}
