package com.tianyongwei.java8.jvm;

public class ObjectCreateTest3 {

  public static void main(String[] args) {
    System.out.println(S.class);
  }

}

class F {
  static {
    System.out.println("f-static");
  }

  public F() {
    System.out.println("f-constructor");
  }
}

class S extends F {
  static {
    System.out.println("s-static");
  }

  public S() {
    System.out.println("s-constructor");
  }
}
