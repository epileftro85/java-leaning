package com.ancla.builder;

import com.ancla.entities.FullPerson;
import com.ancla.services.RegularPersonBuilder;
import com.ancla.services.WorkerPersonBuilder;

/*
 * This is another way to create a builder, we create a single or main entity, now with public accesors.
 * Now we have access to the implementations under each aspect of the object, in this case, we can create
 * just a regular person (unemployed) and another which works too. The implementations are encapsulated,
 * each behave belongs to its class.
 */
public class FacadeBuilder {
  protected FullPerson person = new FullPerson();

  public RegularPersonBuilder lives() {
    return new RegularPersonBuilder(person);
  }

  public WorkerPersonBuilder works() {
    return new WorkerPersonBuilder(person);
  }

  public FullPerson build() {
    return person;
  }
}
