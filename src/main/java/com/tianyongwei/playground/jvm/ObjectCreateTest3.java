package com.tianyongwei.playground.jvm;

public class ObjectCreateTest5 {

  public static void main(String[] args) {
    new S();
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
