package com.ancla.builder;

import java.time.Year;
import com.ancla.enums.Genre;

/*
 * The Builder pattern is a creational design pattern that lets you construct complex objects step by step.
 * The pattern enables you to produce different types and representations of an object using the same construction code.
 * It involves separating the construction of a complex object from its representation so that the same construction process can create different representations
 * This pattern is good when a constructor has several parameters, if the class receives 3 to 6 parameters, is better the pojo way
 */

public class Book {
  // Create private fields, this way we use encapsulation
  private String isbn;
  private String title;
  private Genre genre;
  private String author;
  private Year published;
  private String description;

  // constructor receives a param of type the constructor
  private Book(BookBuilder bookBuilder) {
    this.isbn = bookBuilder.isbn;
    this.title = bookBuilder.title;
    this.genre = bookBuilder.genre;
    this.author = bookBuilder.author;
    this.published = bookBuilder.published;
    this.description = bookBuilder.description;
  }

  @Override
  public String toString() {
    return "Book{" +
        "isbn='" + isbn + '\'' +
        ", title='" + title + '\'' +
        ", genre=" + genre +
        ", author='" + author + '\'' +
        ", published=" + published +
        ", description='" + description + '\'' +
        '}';
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Year getPublished() {
    return published;
  }

  public String getDescription() {
    return description;
  }

  public Genre getGenre() {
    return genre;
  }

  /*
   * Now we can call BookBuilder and build the object with the data we need
   * This way we can leave optional parameters as null and just build the object
   * we need
   */
  public static class BookBuilder {
    private String isbn;
    private String title;
    private Genre genre;
    private String author;
    private Year published;
    private String description;

    public BookBuilder(String isbn, String title) {
      addIsbn(isbn);
      addTitle(title);
    }

    public BookBuilder addIsbn(String isb) {
      this.isbn = isb;
      return this;
    }

    public BookBuilder addTitle(String title) {
      this.title = title;
      return this;
    }

    public BookBuilder addGender(Genre genre) {
      this.genre = genre;
      return this;
    }

    public BookBuilder addAuthor(String author) {
      this.author = author;
      return this;
    }

    public BookBuilder addPublished(Year publish) {
      this.published = publish;
      return this;
    }

    public BookBuilder addDesc(String desc) {
      this.description = desc;
      return this;
    }

    /*
     * The build jusst return new parent instantiation, so we can use the getters
     * and the toString overrided.
     */
    public Book build() {
      return new Book(this);
    }

    public void reset() {
      this.isbn = "";
      this.title = "";
      this.author = "";
      this.description = "";
    }
  }
}
