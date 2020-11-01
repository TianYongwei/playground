package com.tianyongwei.dagger;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Inject;
import javax.inject.Singleton;

/** A simple, skeletal application that defines a simple component. */
public class SimpleApplication {
  static final class Foo {
    @Inject Foo() {}
  }

  @Module
  static final class SimpleModule {
    @Provides
    static Foo provideFoo() {
      return new Foo();
    }
  }

  @Singleton
  @Component(modules = { SimpleModule.class })
  interface SimpleComponent {
    Foo foo();
  }

  public static void main(String[] args) {
    Foo foo = DaggerSimpleApplication_SimpleComponent.create().foo();
  }
}