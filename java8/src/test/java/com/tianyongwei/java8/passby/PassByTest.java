package com.tianyongwei.java8.passby;

import junit.framework.TestCase;

public class PassByTest extends TestCase {

  public void testPlusOne() {
    PassBy passBy = new PassBy();
    int a = 1;
    final int result = passBy.plusOne(a);
    assertEquals(2, result);
    assertEquals(1, a);
  }

  public void testGetString() {
  }

  public void testGetString2() {
  }

  public void testGetObject() {
  }

  public void testGetObject2() {
  }
}