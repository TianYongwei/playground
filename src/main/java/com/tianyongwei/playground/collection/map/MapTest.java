package com.tianyongwei.playground.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

  public static void main(String[] args) {

    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//    concurrentHashMap.put("",null); // 报空指针
//    concurrentHashMap.put(null,""); // 报空指针

    Hashtable hashtable = new Hashtable();
//    hashtable.put("",null); // 报空指针
//    hashtable.put(null,""); // 报空指针

    HashMap hashMap = new HashMap();
    hashMap.put("",null);// 正常
    hashMap.put(null,"");// 正常

    ArrayList<String> a = new ArrayList();
    a.add("1");
    a.add(new String("000"));
    System.out.println(a);
  }
}
