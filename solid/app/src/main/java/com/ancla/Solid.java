/*
 * This source file was generated by the Gradle 'init' task
 */
package com.ancla;

import java.io.IOException;

public class Solid {
  public static void main(String[] args) {
    singleResponsibility();
    System.out.println("*********************************************");
    openClose();
    System.out.println("*********************************************");
    liskov();
  }

  private static void singleResponsibility() {
    SingleResponsibility single = new SingleResponsibility();

    single.addEntry("First entry");
    single.addEntry("Second entry");
    System.out.println(single);

    Persistence persistence = new Persistence();
    String filename = "/some/route/file.txt";

    try {
      persistence.saveToFile(single, filename, true);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void openClose() {
    OpenClose op = new OpenClose();
    op.run();
  }

  private static void liskov() {
    new LiskovSubstitutionViolation().run();
    new LiskovSubstitution().run();
  }
}
