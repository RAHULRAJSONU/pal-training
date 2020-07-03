package io.github.rahulrajsonu.paltraining.factorypattern;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {

  public void processBatch(String fileName) {
    File file = openFile(fileName);
    Parser parser = createParser(file); // Factory Method
    List<Record> records = parser.parse();
    processRecords(records);
    writeSummary();
    closeFile(file);
  }

  //Factory Method
  public abstract Parser createParser(File file);

  private File openFile(String fileName) {
    System.out.println("Opening File.");
    return null;
  }

  private void processRecords(List<Record> records) {
    System.out.println("Processing records.");
  }

  private void writeSummary() {
    System.out.println("Writing batch summary.");
  }

  private void closeFile(File file) {
    System.out.println("File closed.");
  }
}
