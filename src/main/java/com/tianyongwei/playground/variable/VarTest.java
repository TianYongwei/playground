package com.tianyongwei.playground.variable;

public class VarTest {

  public static void main(String[] args) {
    Book book = new Book("青铜时代");
    Student student = new Student(book);

    System.out.println(student);
    book.setName("白银时代");
    System.out.println(student);
  }

}


class Student {
  private Book book;

  public Student(Book book) {
    this.book = book;
  }

  @Override
  public String toString() {
    return new org.apache.commons.lang3.builder.ToStringBuilder(this)
            .append("book", book)
            .toString();
  }
}

class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new org.apache.commons.lang3.builder.ToStringBuilder(this)
            .append("name", name)
            .toString();
  }
}
