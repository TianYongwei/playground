package com.tianyongwei.java8.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IterTest {

  public static void main(String[] args) {

    ArrayList a = new ArrayList();
  }
}

class BookShelf implements Iterable {

  @Override
  public Iterator iterator() {
    return null;
  }
}

class BookShelf2 implements Iterator {



  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }
}
