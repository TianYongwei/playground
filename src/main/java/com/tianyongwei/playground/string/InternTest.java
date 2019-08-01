package com.tianyongwei.playground.string;

public class InternTest {

  public static void main(String[] args) {
    // 这个会触发String intern() 方法
    String a = "2019";
    String b = new String("2019");

    System.out.println("2019" == a); // true
    System.out.println(a == b); // false
  }
}
