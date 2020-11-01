package com.tianyongwei.java8.exception;

public class Itest {

  public static void main(String[] args) {
    System.out.println(app());
    System.out.println(ppa());
  }

  static int app() {
    int a = 0;
    return a++;
  }

  static int ppa() {
    int a = 0;
    return ++a;
  }
}
