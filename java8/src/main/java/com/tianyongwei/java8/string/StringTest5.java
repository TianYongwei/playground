package com.tianyongwei.java8.string;

public class StringTest5 {

  public static void main(String[] args) {
    String s1 = "bc";
    final String s2 = "bc";
    String s3 = "abc";
    String s4 = "a" + "b" + "c";
    String s5 = "a" + s1;
    String s6 = "a" + s2;

    String s7 = new String("abc");


    System.out.println(s3 == s4);
    System.out.println(s3 == s5);
    System.out.println(s3 == s6);
    System.out.println(s3 == s7);
  }
}
