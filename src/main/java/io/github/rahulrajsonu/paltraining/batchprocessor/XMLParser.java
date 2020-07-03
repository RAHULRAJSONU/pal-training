package io.github.rahulrajsonu.paltraining.batchprocessor;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class XMLParser extends TextParser {

  public XMLParser(File file) {
    System.out.println("Creating XML parser.");
  }

  @Override
  public List<Record> parse() {
    System.out.println("Parsing XML file.");
    return Collections.emptyList();
  }
}
