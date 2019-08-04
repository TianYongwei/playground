package com.tianyongwei.playground.resource;

public class ResourceTest {

  public static void main(String[] args) {

    // classloader.getResource() -- 读取classpath下文件
    System.out.println(ResourceTest.class.getClassLoader().getResource(""));
    System.out.println(ResourceTest.class.getClassLoader().getResource("application.properties"));
    // 不能带斜杠，带斜杠都找不到
    System.out.println(ResourceTest.class.getClassLoader().getResource("/"));
    System.out.println(ResourceTest.class.getClassLoader().getResource("/application.properties"));

    // class.getResource()找到包路径
    System.out.println(ResourceTest.class.getResource(""));
    // class.getResource()找到 classpath 路径
    System.out.println(ResourceTest.class.getResource("/"));
    // 使用class.getResource()找到 classpath 路径下文件
    System.out.println(ResourceTest.class.getResource("/application.properties"));
    System.out.println(ResourceTest.class.getResource("../../../../application.properties"));


    // 不知道为什么是NULL，编译没有这个文件
    System.out.println(ResourceTest.class.getClassLoader().getResource("com/tianyongwei/playground/resource/resource.properties"));

  }
}
