package io.github.rahulrajsonu.paltraining.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BasicFileIO {

  public static void main(String[] args) throws FileNotFoundException {
    City c1 = new City("Bengaluru",1993939L);
    City c2 = new City("Delhi",3993939L);
    City c3 = new City("Mumbai",41993939L);
    City c4 = new City("Hydrabad",293939L);
    List<City> cityList = Arrays.asList(c1,c2,c3,c4);
    File file = new File("demo.csv");
    writeToFile(cityList, file,",",Boolean.TRUE);
    System.out.println("Writing completed.");
  }

  private static void writeToFile(List<City> cityList, File file, String delimiter, Boolean append) {
    try(PrintWriter out = new PrintWriter(new FileWriter(file,append))) {
      cityList
          .stream()
          .map(city ->
              city.city
              .concat(delimiter)
              .concat(String.valueOf(city.population)))
          .forEach(out::println);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  static class City{
    String city;
    Long population;

    public City(String city, Long population) {
      this.city = city;
      this.population = population;
    }
  }
}
