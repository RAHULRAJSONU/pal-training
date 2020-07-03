package io.github.rahulrajsonu.paltraining.factorypattern;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class TextParser implements Parser{

  public TextParser(File file) {
    System.out.println("Creating Text parser");
  }

  @Override
  public List<Record> parse() {
    System.out.println("Parsing Text.");
    return Collections.emptyList();
  }
}
