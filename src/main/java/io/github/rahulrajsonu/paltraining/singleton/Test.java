package io.github.rahulrajsonu.paltraining.singleton;

import java.lang.reflect.Constructor;

public class Test {

  public static void main(String[] args) throws Exception{
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = breakSingleton();
    System.out.println(String.format("Object : %s, Hashcode: %d","s1",s1.hashCode()));
    System.out.println(String.format("Object : %s, Hashcode: %d","s2",s2.hashCode()));
  }

  static Singleton breakSingleton() throws Exception {
    Class clazz = Class.forName("io.github.rahulrajsonu.paltraining.singleton.Singleton");
    Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
    constructor.setAccessible(true);
    return constructor.newInstance();
  }
}
