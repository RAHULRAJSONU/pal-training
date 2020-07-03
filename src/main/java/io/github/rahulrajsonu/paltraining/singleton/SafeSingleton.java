package io.github.rahulrajsonu.paltraining.singleton;

public enum SafeSingleton {
  INSTANCE;
  public String getConfiguration(){
    return "Costly resource";
  }
}
