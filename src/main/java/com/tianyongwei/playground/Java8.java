package com.tianyongwei.playground;

public class Java8 {
  public static void main(String[] args) {
    new Thread(() -> {
      System.out.println("123");
      System.out.println(1 <= 2);
    }).start();

    new Thread(() -> {
      System.out.println("dd");
    });

    new Thread(() -> {
      System.out.println();
    }).start();
  }
}
