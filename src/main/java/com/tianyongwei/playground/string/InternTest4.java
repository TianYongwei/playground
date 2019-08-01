package com.tianyongwei.playground.string;

public class InternTest4 {
  public static void main(String[] args) {
    String str = new StringBuilder("计算机").append("软件").toString();
    String str1 = new StringBuilder("ja").append("va").toString();

    System.out.println(str == str.intern());// true
    System.out.println(str1 == str1.intern());// false
  }
}
