package com.tianyongwei.playground.JVM.classloader;

import com.tianyongwei.playground.JVM.classloader3.hello.Hello;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassLoaderMain {

  public static void main(String[] args) {

    ClassLoader classLoaderV1 = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        // 打印加载的类名
        System.out.println(name);
        try {
          if(name.equals("Hello")) {
            byte[] classBytes = Files.readAllBytes(Paths.get("/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/Hello.class.v1"));
            return defineClass(name, classBytes, 0, classBytes.length);
          } else if(name.equals("HelloFather")) {
            byte[] classBytes = Files.readAllBytes(Paths.get(
                    "/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/HelloFather.class"));
            return defineClass(name, classBytes, 0, classBytes.length);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        // 换成 return null; 之后报错
//         return super.loadClass(name);
        return null;
      }
    };

    ClassLoader classLoaderV2 = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        // 打印加载的类名
        System.out.println(name);
        try {
          if(name.equals("Hello")) {
            byte[] classBytes = Files.readAllBytes(Paths.get(
                    "/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/Hello.class.v2"));
            return defineClass(name, classBytes, 0, classBytes.length);
          } else if(name.equals("HelloFather")) {
            byte[] classBytes = Files.readAllBytes(Paths.get(
                    "/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/HelloFather.class"));
            return defineClass(name, classBytes, 0, classBytes.length);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
//         return super.loadClass(name);
        return null;
      }
    };

    try {
      Class<?> helloV1Class = classLoaderV1.loadClass("com.tianyongwei.playground.JVM.classloader3.hello.Hello");
      Object helloV1 = helloV1Class.newInstance();

      Class<?> helloV2Class = classLoaderV2.loadClass("com.tianyongwei.playground.JVM.classloader3.hello.Hello");
      Object helloV2 = helloV2Class.newInstance();

      Hello helloV3 = new Hello();

      helloV1Class.getMethod("sayHello").invoke(helloV1);
      helloV2Class.getMethod("sayHello").invoke(helloV2);
      helloV3.sayHello();

      System.out.println(helloV1.getClass().getClassLoader());
      System.out.println(helloV2.getClass().getClassLoader());
      System.out.println(helloV3.getClass().getClassLoader());

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }


  }

}