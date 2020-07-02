package io.github.rahulrajsonu.paltraining.batchprocessor;

import java.io.File;
import java.util.List;

public class BatchProcessor {
   public void processBatch(String fileName){
     File file = openFile(fileName);
     TextParser parser = new TextParser(file);
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
