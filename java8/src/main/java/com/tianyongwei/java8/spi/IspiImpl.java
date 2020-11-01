package com.tianyongwei.java8.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class IspiImpl implements Ispi {
  @Override
  public void say() {
    System.out.println("IspiImpl...");
  }

  public static void main(String[] args) {
    ServiceLoader<Ispi> load = ServiceLoader.load(Ispi.class);
    Iterator<Ispi> it = load.iterator();
    while (it.hasNext()) {
      Ispi next = it.next();
      next.say();
    }
  }
}
