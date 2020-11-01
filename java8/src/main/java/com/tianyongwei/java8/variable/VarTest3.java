package com.tianyongwei.java8.variable;

public class VarTest3 {

  public static void main(String[] args) {
    System.out.println("======基本数据类型");
    int a_int = 1;
    int b_int = a_int;

    System.out.println(a_int == b_int);
    System.out.println(a_int);
    System.out.println(b_int);

    a_int = 2;

    System.out.println(a_int == b_int);
    System.out.println(a_int);
    System.out.println(b_int);

    System.out.println("======String类型");

    String a = "白银时代";
    String b = a;

    System.out.println(a == b);
    System.out.println(a);
    System.out.println(b);

    a = "黄金时代";

    System.out.println(a == b);
    System.out.println(a);
    System.out.println(b);
  }
}
