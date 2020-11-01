package com.tianyongwei.java8.StringBuilderBuffer;

public class StringBuildBufferTest {
  public static void main(String[] args) {
    StringTestBuilder stb1 = new StringTest();
    StringTestBuilder stb2 = new StringBufferTest();
    StringTestBuilder stb3 = new StringBuilderTest();

    stb1.startTest();
    stb2.startTest();
    stb3.startTest();
  }
}

interface IStringTest {
  void startTest();
  void dosth();
}

abstract class StringTestBuilder implements IStringTest {

  @Override
  public void startTest() {
    Long a = System.currentTimeMillis();
    dosth();
    System.out.println(System.currentTimeMillis() - a);
  }
}

class StringTest extends StringTestBuilder {

  @Override
  public void dosth() {
    String a = "";
    for (int i = 0; i < 9999; i++) {
      a += i;
    }
  }
}

class StringBufferTest extends StringTestBuilder {

  @Override
  public void dosth() {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < 9999; i++) {
      stringBuffer.append(i);
    }
  }
}

class StringBuilderTest extends StringTestBuilder {

  @Override
  public void dosth() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 9999; i++) {
      stringBuilder.append(i);
    }
  }
}