package com.tianyongwei.playground.exception;

public class Itest2 {

  public static void main(String[] args) {
    ipp();
    ppi();
  }

  static void ipp() {
    int j = 0;
    int i = 0;

    j = ++i;
    System.out.println(i);//1
    System.out.println(j);//1
  }

  static void ppi() {
    int j = 0;
    int i = 0;

    j = i++;
    System.out.println(i);//1
    System.out.println(j);//0
  }
}
