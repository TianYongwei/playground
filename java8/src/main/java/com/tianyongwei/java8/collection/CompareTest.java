package com.tianyongwei.java8.collection;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.*;

public class CompareTest {

  public static void main(String[] args) {
    Man tom = new Man("tom", 172.0F, 20);
    Man bob = new Man("bob", 172.1F, 19);
    Man nick = new Man("nick", 172.2F, 18);

    List manList = new ArrayList();
    manList.add(bob);
    manList.add(tom);
    manList.add(nick);

    // 原始插入顺序
    System.out.println(manList);

    // 按照age升序
    Collections.sort(manList);
    System.out.println(manList);

    // 按照身高升序
    Collections.sort(manList, new ManHeightComparator());
    System.out.println(manList);
  }


}

class ManHeightComparator implements Comparator<Man> {

  @Override
  public int compare(Man o1, Man o2) {
    if(!(o2 instanceof Man)) {
      throw new IllegalArgumentException();
    }

    if(!(o2 instanceof Man)) {
      throw new IllegalArgumentException();
    }

    return o1.getHeight() - o2.getHeight() > 0 ? 1
            : (o1.getHeight() - o2.getHeight() < 0 ? -1 : 0);

  }
}

class Man implements Comparable{
  private String name;

  private Float height;

  private Integer age;

  public Man(String name, Float height, Integer age) {
    this.name = name;
    this.height = height;
    this.age = age;
  }

  public Float getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("name", name)
            .append("height", height)
            .append("age", age).append("\n")
            .toString();
  }

  @Override
  public int compareTo(Object o) {
    if(!(o instanceof Man)) {
      throw new IllegalArgumentException();
    }
    Man man = (Man) o;
    return this.age - man.age;
  }
}