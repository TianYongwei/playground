package com.tianyongwei.playground.string;

public class ReplaceTest {

  public static void main(String[] args) {
    String str = "abab";

    System.out.println(str.replace('a','_'));
    System.out.println(str.replace("ab","xx"));
    // 参数是正则表达式
    System.out.println(str.replaceFirst("ab", "xx"));
    System.out.println(str.replaceAll("ab", "xx"));

    System.out.println(str); // 原始值不变
  }
}
