package io.github.rahulrajsonu.paltraining.batchprocessor;

public class App {

  public static void main(String[] args) {
    BatchProcessor batchProcessor = new BatchProcessor();
    batchProcessor.processBatch("inputFile","xml");
    System.out.println("Done.");
  }
}
