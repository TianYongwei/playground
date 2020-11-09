package com.tianyongwei.java8.passby;

public class PassBy {
  int plusOne(int a) {
    a += 1;
    return a;
  }

  String getString(String str) {
    str += "1";
    return str;
  }

  String getString2(String str) {
    str = new String(str + "1");
    return str;
  }

  StringBuilder getObject(StringBuilder sb) {
    sb.append("1");
    return sb;
  }

  StringBuilder getObject2(StringBuilder sb) {
    sb = new StringBuilder("1");
    return sb;
  }
}
