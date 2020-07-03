package io.github.rahulrajsonu.paltraining.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
  private static volatile Singleton singleton = null;

  private Singleton(){
    if(null != singleton){
      throw new RuntimeException("Operation not supported, Please use getInstance()");
    }
    System.out.println("Creating new instance..");
  }
  public static Singleton getInstance(){
    if(null==singleton){
      synchronized (Singleton.class){
        if(null==singleton){
          singleton = new Singleton();
        }
      }
    }
    return singleton;
  }



  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new RuntimeException("Cloning not supported.");
  }
}
