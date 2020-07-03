package io.github.rahulrajsonu.paltraining.factorypattern;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor{

  @Override
  public Parser createParser(File file) {
    return new TextParser(file);
  }
}
