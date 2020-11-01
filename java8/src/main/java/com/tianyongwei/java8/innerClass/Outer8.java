package com.tianyongwei.java8.innerClass;

public class Outer8 {

  public static void main(String[] args) {

    // 成员内部类初始化分两步
    Outer8 outer8 = new Outer8();
    Outer8.Inner8 inner8 = outer8.new Inner8();
    inner8.i++;

    // 静态内部类初始化
    Outer8.StaticInner8 staticInner8 = new Outer8.StaticInner8();
    staticInner8.j++;

    // 成员内部类
    BeanOut beanOut = new BeanOut();
    BeanOut.BeanInner beanInner = beanOut.new BeanInner();
    beanInner.k++;

  }

  class Inner8 {
    public int i;
  }

  static class StaticInner8 {
    public int j;
  }

}

class BeanOut {
  class BeanInner {
    public int k;
  }
}
