package com.tianyongwei.java8.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {


  public static void main(String[] args) {
    SingletonInner in = SingletonInner.getSingleton();
    System.out.println(in);

    try {
      Constructor constructor = SingletonInner.class.getDeclaredConstructor();
      System.out.println("accessable: " + constructor.isAccessible());
      constructor.setAccessible(true);
      System.out.println("accessable: " + constructor.isAccessible());
      SingletonInner in2 = (SingletonInner) constructor.newInstance();
      System.out.println(in2);
      System.out.println(in == in2);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
  }


}

class SingletonInner {
  private static class Holder {
    private static SingletonInner singleton = new SingletonInner();
  }

  // 改造构造方法，完善单例
  private static volatile boolean constructable = true;
  private SingletonInner(){
    if(constructable) {
      constructable = false;
    } else {
      throw new RuntimeException("不能构造");
    }
  }

  public static SingletonInner getSingleton(){
    return Holder.singleton;
  }
}