package com.tianyongwei.java8.variable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class VarTest4 {

  public static void main(String[] args) {

    VarTest4Class[] v4cs = new VarTest4Class[1];
    VarTest4Class v4c = new VarTest4Class("一只特立独行的猪");

    v4cs[0] = v4c;

    System.out.println("====== 引用数据类型");
    printsV4cs(v4cs);
    printsV4c(v4c);

    changeObj(v4c);

    printsV4cs(v4cs);// 被修改
    printsV4c(v4c);// 被修改

    System.out.println("====== 引用数据类型");
    printsV4cs(v4cs);
    printsV4c(v4c);

    changeArr(v4cs);

    printsV4cs(v4cs);// 被修改
    printsV4c(v4c);// 被修改

    System.out.println("====== 基本数据类型-int");
    int a = 1;
    changeInt(a);
    System.out.println(a);// 没有被修改

    System.out.println("====== 包装类-Integer");
    Integer b = new Integer(1);
    changeInteger(b);
    System.out.println(b);// 没有被修改
  }

  private static void changeInteger(Integer b) {
    b = b +1;
  }

  private static void changeInt(int a) {
    a = a + 1;
  }

  private static void changeArr(VarTest4Class[] v4cs) {
    v4cs[0].setClassName("海边的卡夫卡");
  }

  private static void changeObj(VarTest4Class v4c) {
    v4c.setClassName("挪威的森林");
  }

  private static void printsV4c(VarTest4Class v4c) {
    System.out.println(v4c);
  }

  private static void printsV4cs(VarTest4Class[] v4cs) {
    for (int i = 0; i < v4cs.length; i++) {
      System.out.println(v4cs[0]);
    }
  }

}

class VarTest4Class {
  private String className;

  public VarTest4Class(String className) {
    this.className = className;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("className", className)
            .toString();
  }
}
