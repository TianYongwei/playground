package com.tianyongwei.playground.innerClass;

public class InnerClass1 {

}
// 成员内部类
class Outer {

  class Inner {
  }
}

// 局部内部类
class Outer1 {

  void sayHello() {

    class Inner1 {
      void say() {
        System.out.println(1);
      }
    }
  }
}

// 静态内部类
class Outer2 {

  static class Inner2 {
  }
}

// 匿名内部类
class Outer3 {

  public static void main(String[] args) {
    Outer4 outer4 = new Outer4() {
      @Override
      void say() {
        System.out.println("继承了Outer4");
      }
    };
  }

}
class Outer4 {
  void say() {
  }
}

// 静态内部类不能使用外部类的非静态变量

class Outer5 {
  int a = 5;
  static int b = 5;

  static class Inner5 {
    void say() {
//      System.out.println(a);// 编译错误
      System.out.println(b);// 正常
    }
  }
}





