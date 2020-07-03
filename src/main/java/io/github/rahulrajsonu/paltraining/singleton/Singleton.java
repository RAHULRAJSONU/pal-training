package io.github.rahulrajsonu.paltraining.singleton;

public class Singleton {
  private final static Singleton singleton = new Singleton();

  private Singleton(){
    System.out.println("Creating new instance..");
  }
  public static Singleton getInstance(){
    return singleton;
  }
}
