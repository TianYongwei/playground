package com.tianyongwei.playground.JVM.classloader2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassLoaderMain2 {

  public static void main(String[] args) {

    ClassLoader classLoaderV1 = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        // 打印加载的类名
        System.out.println(name);
        try {
          if(name.equals("com.tianyongwei.playground.JVM.classloader2.hello.Hello")) {
            byte[] classBytes = Files.readAllBytes(Paths.get("/Users/tianyongwei/dev/github/playground/src/main/resources/classfiles/Hello.class.v1"));
            return defineClass(name, classBytes, 0, classBytes.length);
          } else if(name.equals("com.tianyongwei.playground.JVM.classloader2.hello.HelloFather")) {
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


    try {
      Class<?> helloV1Class = classLoaderV1.loadClass("com.tianyongwei.playground.JVM.classloader3.hello.Hello");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}