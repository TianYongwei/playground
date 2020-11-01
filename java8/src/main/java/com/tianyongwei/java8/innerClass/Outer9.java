package com.tianyongwei.java8.innerClass;

public class Outer9 {

  public static void main(String[] args) {
    Outer9 outer9 = new Outer9();
    Outer9.Inner9 inner9 = outer9.new Inner9();
    inner9.print();
  }

  private int a = 1;
  class Inner9 {
    private int a = 2;
    public void print() {
      int a = 3;
      System.out.println("局部变量：" + a);
      System.out.println("内部类变量：" + this.a);
      System.out.println("外部类变量：" + Outer9.this.a);
    }
  }
}

