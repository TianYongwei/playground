package com.tianyongwei.playground.variable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class VarTest2 {

  public static void main(String[] args) {
    Stu stu = new Stu("王小波");
    Stu stu1 = stu;

    System.out.println(stu == stu1);
    System.out.println(stu);
    System.out.println(stu1);

    stu.setName("李银河");

    System.out.println(stu == stu1);
    System.out.println(stu);
    System.out.println(stu1);
  }

}

class Stu {
  private String name;

  public Stu(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("name", name)
            .toString();
  }
}
