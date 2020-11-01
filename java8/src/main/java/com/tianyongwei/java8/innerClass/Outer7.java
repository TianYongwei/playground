package com.tianyongwei.java8.innerClass;

public class Outer7 {
  void test () {
    StringBuilder a = new StringBuilder("a");
    final StringBuilder b = new StringBuilder("b");
    int c = 6;
    new Thread() {
      @Override
      public void run() {
        a.append("a");
        b.append("b");
        // c = 7; // 编译报错
        System.out.println("==" + a.hashCode());
        System.out.println("==" + a);// aa
        System.out.println("==" + b);// bb

      }
    }.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(a.hashCode());
    System.out.println(a);// aa
    System.out.println(b);// bb
  }

  public static void main(String[] args) {
    new Outer7().test();
  }
}
