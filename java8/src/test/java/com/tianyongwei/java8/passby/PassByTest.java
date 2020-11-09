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
    PassBy passBy = new PassBy();
    String str = "1";
    final String result = passBy.getString(str);
    assertEquals("11", result);
    assertEquals("1", str);
  }

  public void testGetString2() {
    PassBy passBy = new PassBy();
    String str = "1";
    final String result = passBy.getString2(str);

    assertEquals("1", str);
    assertEquals("11", result);
  }

  public void testGetObject() {

    PassBy passBy = new PassBy();
    StringBuilder sb = new StringBuilder("1");
    final StringBuilder result = passBy.getObject(sb);

    assertEquals("11", sb.toString());
    assertEquals(new StringBuilder("11").toString(), result.toString());
  }

  public void testGetObject2() {
    PassBy passBy = new PassBy();
    StringBuilder sb = new StringBuilder("1");
    final StringBuilder result = passBy.getObject2(sb);

    assertEquals("1", sb.toString());
    assertEquals("11", result.toString());
  }
}