package com.tianyongwei.playground.objectclone;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CloneTest {

  public static void main(String[] args) throws CloneNotSupportedException {

    Writer writer = new Writer(45, "王小波",new Book("黄金时代"));

    // 拷贝后比较内存地址
    Writer writer2 = (Writer) writer.clone();
    System.out.println(writer == writer2); // false
    System.out.println(writer);
    System.out.println(writer2);

    // 改变其中一个的基础数据类型成员变量
    System.out.println(writer.getAge() == writer2.getAge()); // true
    writer.setAge(44);
    System.out.println(writer.getAge() == writer2.getAge()); // false
    System.out.println(writer);
    System.out.println(writer2);

    // 改变其中一个String类型成员变量
    System.out.println((writer.getName() == writer2.getName()));// true
    writer.setName("李银河");
    System.out.println((writer.getName() == writer2.getName()));// false
    System.out.println(writer);
    System.out.println(writer2);

    System.out.println(writer.getBook() == writer2.getBook()); // true
    writer.getBook().setBookname("白银时代");
    System.out.println(writer); //
    System.out.println(writer2); //
  }

}

class Writer implements Cloneable{
  private int age;

  private String name;

  private Book book;

  public Writer(int age, String name, Book book) {
    this.age = age;
    this.name = name;
    this.book = book;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

//  @Override
//  protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
//  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Writer newWriter = (Writer) super.clone();
    newWriter.setBook((Book)newWriter.getBook().clone());
    return newWriter;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("age", age)
            .append("name", name)
            .append("book", book)
            .toString();
  }
}

class Book implements Cloneable{
  private String bookname;

  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public Book(String bookname) {
    this.bookname = bookname;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // 这里只有一个String类型的成员变量，无需进一步实现clone;
    return super.clone();
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("bookname", bookname)
            .toString();
  }
}
