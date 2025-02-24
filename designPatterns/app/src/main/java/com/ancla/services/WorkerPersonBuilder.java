package com.ancla.services;

import com.ancla.builder.FacadeBuilder;
import com.ancla.entities.FullPerson;

public class WorkerPersonBuilder extends FacadeBuilder {
  public WorkerPersonBuilder(FullPerson person) {
    this.person = person;
  }

  public WorkerPersonBuilder company(String company) {
    person.companyName = company;
    return this;
  }

  public WorkerPersonBuilder position(String position) {
    person.position = position;
    return this;
  }

  public WorkerPersonBuilder income(Integer income) {
    person.annualIncome = income;
    return this;
  }
}
