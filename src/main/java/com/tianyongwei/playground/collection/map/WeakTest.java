package com.tianyongwei.playground.collection.map;

import java.lang.ref.WeakReference;

public class WeakTest {
  public static void main(String[] args) {
    String a = new String("Java");
    WeakReference wr = new WeakReference(a);
    System.out.println(wr.get());
    // 不再引用 new String("Java") 这个 String对象
    a = null;
    // 此时还没有被回收
    System.out.println(wr.get());
    System.gc();
    // 已经被回收
    System.out.println(wr.get());
  }
}
