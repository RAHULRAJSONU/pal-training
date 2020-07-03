package io.github.rahulrajsonu.paltraining.singleton;

public class Test {

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(String.format("Object : %s, Hashcode: %d","s1",s1.hashCode()));
    System.out.println(String.format("Object : %s, Hashcode: %d","s2",s2.hashCode()));
  }
}
