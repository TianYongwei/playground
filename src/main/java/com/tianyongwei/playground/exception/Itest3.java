package com.tianyongwei.playground.exception;

public class Itest3 {

  public static void main(String[] args) {

    int i = 0;

    for (int j = 0; j < 100; j++) {
      i = i++;
//      i = ++i;

      System.out.println(i);
    }

    System.out.println("===" + i);

    System.out.println("---" + inc());
  }

  public static int inc() {
    int x;
    try {
      x=1;
      return x;
    } catch (Exception e) {
      x=2;
      return x;
    }
    finally{
      x=3;
    }
  }
}
