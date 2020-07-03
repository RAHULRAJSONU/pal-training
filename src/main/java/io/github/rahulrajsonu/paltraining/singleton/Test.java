package io.github.rahulrajsonu.paltraining.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {

  public static void main(String[] args) throws Exception{
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = breakSingletonUsingSerialization(s1);
    System.out.println(String.format("Object : %s, Hashcode: %d","s1",s1.hashCode()));
    System.out.println(String.format("Object : %s, Hashcode: %d","s2",s2.hashCode()));
  }

  static Singleton breakSingletonUsingReflection() throws Exception {
    Class clazz = Class.forName("io.github.rahulrajsonu.paltraining.singleton.Singleton");
    Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
    constructor.setAccessible(true);
    return constructor.newInstance();
  }

  static Singleton breakSingletonUsingSerialization(Singleton singleton) throws Exception{
    ObjectOutputStream oos =
        new ObjectOutputStream(new FileOutputStream("singleton"));
    oos.writeObject(singleton);
    ObjectInputStream ois =
        new ObjectInputStream(new FileInputStream("singleton"));
    return (Singleton) ois.readObject();
  }
}
