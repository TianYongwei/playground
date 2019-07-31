package com.tianyongwei.playground.enum1;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class EnumTest {
  public static void main(String[] args) {
    System.out.println(Signal.RED);

    Signal signal = Signal.BLUE;
    switch (signal) {
      case RED:
        System.out.println("1");
        break;
      case YELLOW:
        System.out.println("2");
        break;
      case BLUE:
        System.out.println("3");
        break;
    }
  }
}

// 标注
enum Signal {
  RED("红色"),
  YELLOW("黄色"),
  BLUE("蓝色");

  // 构造方法只能是 private
  Signal(String name) {
    this.name = name;
  }

  String name;

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("name", name)
            .toString();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

interface Food {

  void cook();

  enum Coffee implements Food {
    ;
    @Override
    public void cook() {

    }
  }

  enum Dessert implements Food {
    ;
    @Override
    public void cook() {

    }
  }
}