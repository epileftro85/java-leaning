package com.ancla;

class Rectangle {
  protected int width;
  protected int height;

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getArea() {
    return width * height;
  }
}

class Square extends Rectangle {
  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(int height) {
    super.setWidth(height);
    super.setHeight(height);
  }
}

class LiskovSubstitutionViolation {
  private void increaseRectangleHeight(Rectangle rectangle) {
    int originalWidth = rectangle.getWidth();
    rectangle.setHeight(rectangle.getHeight() + 10);
    System.out.println("Rectangle new area: " + rectangle.getArea());
    if (rectangle.getWidth() != originalWidth) {
      System.out.println("LSP Violated!");
    }
  }

  public void run() {
    LiskovSubstitutionViolation ls = new LiskovSubstitutionViolation();
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(5);
    rectangle.setHeight(10);

    Square square = new Square();
    square.setWidth(5);

    ls.increaseRectangleHeight(rectangle); // works as expected.
    ls.increaseRectangleHeight(square); // breaks the intended functionality of a square.

  }
}

// when possible, using composition instead of inheritance can help to avoid
// many of the pitfalls that relate to the LSP.

// This is call IntAreas because it does not works for circles and shapes which
// area is double
abstract class IntAreas {
  public abstract int getArea();

  public abstract String name();
}

class Triangle extends IntAreas {
  private int height;
  private int base;

  public Triangle(int height, int base) {
    this.height = height;
    this.base = base;
  }

  @Override
  public int getArea() {
    return (base * height) / 2;
  }

  @Override
  public String name() {
    return "Triangle";
  }
}

class Trapezoid extends IntAreas {
  private int baseOne, baseTwo, height;

  public Trapezoid(int baseOne, int baseTwo, int height) {
    this.baseOne = baseOne;
    this.baseTwo = baseTwo;
    this.height = height;
  }

  @Override
  public int getArea() {
    return ((baseOne + baseTwo) / 2) * height;
  }

  @Override
  public String name() {
    return "Hexagon";
  }
}

/**
 * LiskovSubstitution
 */
public class LiskovSubstitution {
  void printIntAreasArea(IntAreas shape) {
    System.out.println("IntAreas area of %s: %d".formatted(shape.name(), shape.getArea()));
  }

  public void run() {
    Triangle triangle = new Triangle(7, 10);
    Trapezoid trapezoid = new Trapezoid(10, 12, 5);

    printIntAreasArea(triangle);
    System.out.println("-----------------------------------------");
    printIntAreasArea(trapezoid);
  }
}
