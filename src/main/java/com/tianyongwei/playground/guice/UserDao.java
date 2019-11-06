package com.tianyongwei.playground.guice;

import com.google.inject.Singleton;

//@Singleton
public class UserDao {
  void say () {
    System.out.println("注入成功！");
  }
}
