package com.tianyongwei.playground.jvm;

public class ObjectCreateTest2 {
  public static void main(String[] args) {

//    Fa son = new So();
//    System.out.println("======");
//    son = new So();

    new Fa();
    System.out.println("======");
    new Fa();
  }

}

class Fa {

  static int f_int = 1;

  static int fa = fa_method();

  int fb = fb_method();

  private int fb_method() {
    System.out.println("fa-non-static-method");
    return 2;
  }

  private static int fa_method() {
    System.out.println("f_int: " + f_int);
    System.out.println("fa-static-method");
    return 1;
  }

  static {
    System.out.println("fa-static-block");
  }

  public Fa() {
    System.out.println("fa-constructor");
  }
}

class So extends Fa {
  static {
    System.out.println("so-static-block");
  }

  public So() {
    System.out.println("so-constructor");
  }
}
