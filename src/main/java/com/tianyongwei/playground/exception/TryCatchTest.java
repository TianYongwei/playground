package com.tianyongwei.playground.exception;

public class TryCatchTest {

  public static void main(String[] args) {
    System.out.println("no_exception_method() == " + no_exception_method3());
  }


  static int no_exception_method() {
    int a = 1;
    try {
      System.out.println(a);
      a = a / 0;
      return a++;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return a++;
    }
  }

  static int no_exception_method2() {
    int a = 1;
    try {
      System.out.println(a);
      a = a / 0;
      return a++;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return ++a;
    }
  }

  static int no_exception_method3() {
    int a = 1;
    try {
      System.out.println(a);
      a = a / 0;
      return a++;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return a+=1;
    }
  }

}
