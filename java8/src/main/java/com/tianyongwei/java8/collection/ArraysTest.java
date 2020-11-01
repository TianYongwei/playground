package com.tianyongwei.java8.collection;

public class ArraysTest {
  public static void main(String[] args) {
    System.out.println((Object)int.class == (Object)Object[].class);// false
    System.out.println((Object)String.class == (Object)Object[].class);// false
    System.out.println((Object)Object.class == (Object)Object[].class);// false
    System.out.println((Object)Object[].class == (Object)Object[].class);// true
  }
}
