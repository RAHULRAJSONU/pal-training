package io.github.rahulrajsonu.paltraining.batchprocessor;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class CSVParser implements Parser {

  public CSVParser(File file) {
    System.out.println("Creating CSV parser.");
  }

  @Override
  public List<Record> parse() {
    System.out.println("Parsing CSV file.");
    return Collections.emptyList();
  }
}
