package io.github.rahulrajsonu.paltraining.factorypattern;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class XMLParser implements Parser {

  public XMLParser(File file) {
    System.out.println("Creating XML parser.");
  }

  @Override
  public List<Record> parse() {
    System.out.println("Parsing XML file.");
    return Collections.emptyList();
  }
}
