package com.ancla;

// Martin explains this principle by advising, “Make fine-grained interfaces that are client-specific.
// Clients should not be forced to implement interfaces they do not use.”

class Document {
}

// Machine has several functionalities, which will be un used in some inherited
// classes;
interface Machine {
  void print(Document d);

  void fax(Document d);

  void scan(Document d);
}

class newPrinter implements Machine {
  @Override
  public void print(Document d) {
    // Do something
  }

  @Override
  public void fax(Document d) {
    // Do something
  }

  @Override
  public void scan(Document d) {
    // Do something
  }
}

class oldPrinter implements Machine {
  @Override
  public void print(Document d) {
    // The old printer can print a document
  }

  @Override
  public void fax(Document d) {
    // The old printer can't fax a document
    // One can just ignore it or throw an exception
  }

  @Override
  public void scan(Document d) {
    // The old printer can't scan a document
    // One can just ignore it or throw an exception
  }
}

/*
 * The correct way to do this approach is segregating the Machine interface
 * by its functions, for example.
 */
interface Printer {
  void print(Document d);
}

interface Faxing {
  void faxing(Document d);
}

interface Scanning {
  void scanning(Document d);
}

class printer implements Printer {
  public void print(Document d) {
    // Do something
  }
}

class Photocopies implements Printer, Scanning {
  public void print(Document d) {
  }

  public void scanning(Document d) {
  }
}
/*
 * or making an interface which extends the needed interfaces
 * and after that use it in the class Photocopies
 *
 * interface MultifunctionalPhotocopy extends Pinter, Scanning {}
 * and then do the next
 *
 * class Photocopies implements MultifunctionalPhotocopy ...
 */

/**
 * InterfaceSegregation
 */
public class InterfaceSegregation {
}
