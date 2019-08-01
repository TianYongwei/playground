package com.tianyongwei.playground.string;

public class StringTest2 {
  public static void main(String[] args) {
    String a = "A";
    String b = "B";

    // 变量拼接
    String c = a + b;
    String d = "AB";
    System.out.println(c == d); // false

    // 字面量拼接
    String e = "A" + "B";
    System.out.println(d == e); // true
  }
}
