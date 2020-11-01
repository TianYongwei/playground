package com.tianyongwei.java8.closure;

public class ClosureTest {

  public static void main(String[] args) {

    ClosureTest t1 = new ClosureTest();
    ClosureTest t2 = t1;
    System.out.println(t1.equals(t2));// true
    System.out.println(t1 == t2);// true

    final int final_a = 1;
//    final_a = 2; // 报错 =2 改变了final_a的变量地址
    final int final_b = 1;

    final int final_c = final_a;

    System.out.println(final_a == final_b);// true
    System.out.println(final_a == final_c);// true


    int aa = 1;
    int bb = aa;
    System.out.println(aa == bb);// true
    aa = 2;
    System.out.println(aa == bb);// false

    String ss = "1";
    String ss2 = ss;

    System.out.println("===");
    System.out.println(ss == ss2);
    ss = "2";
    System.out.println(ss == ss2);
    System.out.println(ss);
    System.out.println(ss2);

    String[] arr = {"1", "2"};
    String[] arr2 = arr;

    arr[0] = "3";
    System.out.println("arr====");
    System.out.println(arr);
    System.out.println(arr2);


    StringBuilder sb = new StringBuilder("1");
    StringBuilder sb2 = sb;

    System.out.println(sb == sb2); // true

    sb.append(2);
    System.out.println(sb == sb2); // true
    System.out.println(sb);
    System.out.println(sb2);

  }

  private static void b(int a) {
    a += 1;
    System.out.println("==" + a);
  }


}
