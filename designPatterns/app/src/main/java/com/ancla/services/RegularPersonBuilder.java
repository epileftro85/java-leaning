package com.ancla.services;

import com.ancla.builder.FacadeBuilder;
import com.ancla.entities.FullPerson;

public class RegularPersonBuilder extends FacadeBuilder {
  public RegularPersonBuilder(FullPerson person) {
    this.person = person;
  }

  public RegularPersonBuilder at(String address) {
    person.streetAddress = address;
    return this;
  }

  public RegularPersonBuilder withPostCode(String postCode) {
    person.postcode = postCode;
    return this;
  }

  public RegularPersonBuilder in(String city) {
    person.city = city;
    return this;
  }
}
