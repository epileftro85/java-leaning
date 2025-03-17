# Coffee Machine Project: SOLID Principles in Action

This project is a learning exercise designed to demonstrate the application of SOLID principles in a real-world scenario. We'll be building a simplified coffee machine, focusing on how to design a maintainable and flexible system.

## Project Goal

The goal is to create a coffee machine simulation that can:

* Prepare different types of coffee.
* Manage ingredient levels (water, coffee beans, milk, etc.).
* Handle user interactions (selecting coffee, starting the brewing process).
* Provide basic error handling (e.g., insufficient ingredients).

## Requirements

The coffee machine should support the following features:

1.  **Coffee Selection:**
    * Users should be able to select from a variety of coffee types (e.g., Espresso, Americano, Latte, Cappuccino).
2.  **Ingredient Management:**
    * The machine should track the levels of essential ingredients.
    * It should prevent brewing if any ingredient is insufficient.
    * It should allow for refilling ingredients.
3.  **Brewing Process:**
    * The machine should simulate the brewing process, including grinding beans, heating water, and mixing ingredients.
    * The brewing process must be adaptable to each different type of coffee.
4.  **User Interface:**
    * A simple interface (e.g., console-based) should allow users to interact with the machine.
    * The interface should display coffee options, ingredient levels, and error messages.
5.  **Error Handling:**
    * The machine should handle errors gracefully, such as insufficient ingredients or invalid user input.
    * Errors should be displayed to the user in a clear fashion.
6.  **Extensibility:**
    * The design should allow for easy addition of new coffee types and features in the future.
    * It should be easy to add new ingredient types.
7.  **Testability:**
    * The design should make it easy to write unit tests for the core functionality.

## Learning Objectives

This project will help you understand and apply the following SOLID principles:

* **Single Responsibility Principle (SRP):** Ensuring each class has a single, well-defined responsibility.
* **Open/Closed Principle (OCP):** Designing classes that are open for extension but closed for modification.
* **Liskov Substitution Principle (LSP):** Implementing inheritance correctly to ensure subtypes can be substituted for their base types.
* **Interface Segregation Principle (ISP):** Creating specific interfaces for clients to avoid unnecessary dependencies.
* **Dependency Inversion Principle (DIP):** Decoupling high-level modules from low-level modules using abstractions.
* **Design Patterns** This are just testeable and well known design patterns.

This project provides a practical way to learn how to design robust and maintainable software using SOLID principles. Good luck!

### NOTE: You should implement the admin strategy for take out the money, this will light you how easy would be to extends new code.