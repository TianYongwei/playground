package com.tianyongwei.playground.collection.map;

import java.util.WeakHashMap;

public class WeakHashMapTest {

  public static void main(String[] args) {
    String a = new String("Java");

    WeakHashMap<String, Integer> wh = new WeakHashMap<>();
    wh.put(a, 100);
    System.out.println(wh);

    a = null;
    System.out.println(wh);

    System.gc();
    System.out.println(wh);
  }
}
