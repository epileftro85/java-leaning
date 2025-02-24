package com.ancla.entities;

public class FullPerson {
  public String streetAddress, postcode, city;

  public String companyName, position;

  public int annualIncome;

  @Override
  public String toString() {
    return "Person{" +
        "streetAddress='" + streetAddress + '\'' +
        ", postcode='" + postcode + '\'' +
        ", city='" + city + '\'' +
        ", companyName='" + companyName + '\'' +
        ", position='" + position + '\'' +
        ", annualIncome=" + annualIncome +
        '}';
  }
}
