package com.tianyongwei.java8.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector();
    UserService service = injector.getInstance(UserService.class);
    service.say();
  }
}
