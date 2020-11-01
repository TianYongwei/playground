package com.tianyongwei.java8.collection;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

  public static void main(String[] args) {

    Collection collection = new ArrayList();
    collection.add(1);
    collection.add(1);

    collection.add(1);
    collection.add(1);
    collection.add(1);
    collection.add(1);
    collection.add(1);
    collection.add(1);
    collection.add(1);
    collection.add(1);
    System.out.println(collection.iterator().next());
    System.out.println(collection.size());
    ((ArrayList) collection).trimToSize();
    System.out.println(collection.size());
  }
}
