package com.tianyongwei.playground.string;

public class InternTest2 {
  public static void main(String[] args) {
    String str1 = "hello";// 字面量会放进常量池
    String str2 = new String("hello");

    System.out.println(str1 == str2);// false
    System.out.println(str1 == str2.intern());// true

    String str3 = new StringBuilder("he").append("llo").toString();
    System.out.println(str1 == str3);// false
    System.out.println(str2 == str3);// false

    System.out.println(str1 == str3.intern()); // true
    System.out.println(str2.intern() == str3.intern()); // true

    // java 虚拟机启动阶段已经被放进常量池，调用 intern 时候返回常量池内引用
    String str4 = new StringBuilder("ja").append("va").toString();
    System.out.println(str4.intern() == str4); // false

    // java2 从来没有被放进常量池，第一次调用 intern 返回 String 对象引用
    String str5 = new StringBuilder("ja").append("va2").toString();
    System.out.println(str5.intern() == str5); // true
  }
}
