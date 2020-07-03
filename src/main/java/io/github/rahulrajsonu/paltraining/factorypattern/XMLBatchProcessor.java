package io.github.rahulrajsonu.paltraining.factorypattern;

import java.io.File;

public class XMLBatchProcessor extends BatchProcessor {

  @Override
  public Parser createParser(File file) {
    return new XMLParser(file);
  }
}
