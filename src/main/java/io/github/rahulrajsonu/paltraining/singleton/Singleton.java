package io.github.rahulrajsonu.paltraining.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
  private final static Singleton singleton = new Singleton();

  private Singleton(){
    System.out.println("Creating new instance..");
  }
  public static Singleton getInstance(){
    return singleton;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
