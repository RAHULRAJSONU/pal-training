package io.github.rahulrajsonu.paltraining.batchprocessor;

import java.io.File;
import java.util.List;

public class BatchProcessor {

  public void processBatch(String fileName, String type) {
    File file = openFile(fileName);
    TextParser parser = null;
    if (type.equals("text")) {
      parser = new TextParser(file);
    } else if (type.equals("csv")) {
      parser = new CSVParser(file);
    }
    List<Record> records = parser.parse();
    processRecords(records);
    writeSummary();
    closeFile(file);
  }

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
