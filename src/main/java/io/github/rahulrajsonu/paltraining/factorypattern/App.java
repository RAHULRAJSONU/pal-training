package io.github.rahulrajsonu.paltraining.factorypattern;

public class App {

  public static void main(String[] args) {
    BatchProcessor batchProcessor = createBatchProcessor(args[0]);
    batchProcessor.processBatch(args[1]);
    System.out.println("Done.");
  }

  private static BatchProcessor createBatchProcessor(String type) {
    if(type.equals("text")){
      return new TextBatchProcessor();
    }else if(type.equals("csv")){
      return new CSVBatchProcessor();
    }else if(type.equals("xml")) {
      return new XMLBatchProcessor();
    }else {
      throw new RuntimeException("Processor not supported: "+type);
    }
  }
}
