package com.tianyongwei.java8.string;

public class InternTest3 {
  public static void main(String[] args) {
    // 会产生三个常量 a b ab
    String str1 = "a" + "b";
    String str2 = new StringBuilder("a").append("b").toString();

    System.out.println(str2.intern() == "ab");// true
  }
}
