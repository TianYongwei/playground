package com.tianyongwei.playground.jvm;

public class ObjectCreateTest {

  public static void main(String[] args) {
    Son son = new Son();
  }

}

class Father {
  public Father() {
    System.out.println("father...");
  }
}

class Son extends Father {
  public Son() {
    System.out.println("son...");
  }
}
