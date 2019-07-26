package com.tianyongwei.playground.OO;

public class ClassLoaderMain {

  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("使用匿名内部类实现接口的方法");
      }
    };
    new Thread(runnable).start();

    Thread thread = new Thread() {
      @Override
      public void run() {
        System.out.println("使用匿名内部类实现普通类方法");
      }
    };
    thread.start();

    Test test = new Test() {
      @Override
      void sayHello() {
        System.out.println("hello！");
      }
    };
    test.sayHello();
  }
}

class Test {
  void sayHello() {
    System.out.println("你好！");
  }
}
