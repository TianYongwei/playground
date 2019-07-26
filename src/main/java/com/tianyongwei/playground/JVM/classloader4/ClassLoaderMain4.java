package com.tianyongwei.playground.JVM.classloader4;

import com.tianyongwei.playground.JVM.classloader4.hello.Hello;
import com.tianyongwei.playground.JVM.classloader4.hello.HelloFather;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassLoaderMain4 {

  public static void main(String[] args) {

    ClassLoader classLoaderV1 = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        // 打印加载的类名
        // System.out.println("ClassName: " + name);
        try {
          if(name.equals("com.tianyongwei.playground.JVM.classloader4.hello.Hello")) {
            byte[] classBytes = Files.readAllBytes(Paths.get("/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/Hello.class"));
            return defineClass(name, classBytes, 0, classBytes.length);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        // 换成 return null; 之后报错
        return super.loadClass(name);
        // return null;
      }
    };


    try {
      Class<?> helloClass = classLoaderV1.loadClass("com.tianyongwei.playground.JVM.classloader4.hello.Hello");

      HelloFather fatherByClassBytes = (HelloFather) helloClass.newInstance();
      // 查看字节码加载的类的ClassLoader
      System.out.println(fatherByClassBytes.getClass().getClassLoader());
      fatherByClassBytes.sayHello();

      HelloFather fatherByNew = new Hello();
      // 查看new出来的类的ClassLoader
      System.out.println(fatherByNew.getClass().getClassLoader());
      fatherByNew.sayHello();

      // 查看HelloFather.class的ClassLoader
      System.out.println("\n" + HelloFather.class.getClassLoader());

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    }
  }

}