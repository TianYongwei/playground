package com.tianyongwei.java8.string;

public class StringTest {
  public static void main(String[] args) {
//    final String str3 = "ab";
//    String str31 = str3+"cd";
//    String str32 = "abcd";
//    System.out.println("str2 = str3 : " + (str31 == str32)); // false

    String str2 = "ab";
    String str3 = "cd";
    String str41 = str2 + str3;
    String str42 = "ab"+str3;
    String str43 = str2+"cd";
    String str5 = "abcd";
    System.out.println("str41 = str5 : " + (str41 == str5)); // false
    System.out.println("str42 = str5 : " + (str42 == str5)); // false
    System.out.println("str43 = str5 : " + (str43 == str5)); // false
  }
}
