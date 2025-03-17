# SOLID Principles in Practice

This repository provides practical examples and explanations of the SOLID principles of object-oriented design. These principles are essential for writing maintainable, scalable, and robust software.

## What are SOLID Principles?

SOLID is an acronym representing five fundamental principles of object-oriented design:

* **S**ingle Responsibility Principle (SRP)
* **O**pen/Closed Principle (OCP)
* **L**iskov Substitution Principle (LSP)
* **I**nterface Segregation Principle (ISP)
* **D**ependency Inversion Principle (DIP)

## Why Understand SOLID?

Understanding and applying SOLID principles helps you:

* Write code that is easier to understand and maintain.
* Reduce the risk of introducing bugs when making changes.
* Create more flexible and reusable code.
* Improve the overall architecture of your software.
* Allow for easier testing.

## Principles and Examples

### 1. Single Responsibility Principle (SRP)

* **Summary:** A class should have only one reason to change, meaning it should have only one responsibility.
* **Why understand it**: SRP helps prevent classes from becoming bloated and difficult to manage. Changes to one responsibility won't accidentally affect others.
* **Example**: See the `solid/app/src/main/java/com/ancla/SingleResponsibility.java` directory for examples.
* **Documentation**:
    * [Wikipedia: Single-responsibility principle](https://en.wikipedia.org/wiki/Single-responsibility_principle)
    * [Robert C. Martin (Uncle Bob) on SRP](https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html)

### 2. Open/Closed Principle (OCP)

* **Summary:** Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
* **Why understand it**: OCP allows you to add new functionality without modifying existing code, reducing the risk of introducing bugs and making your code more adaptable to change.
* **Example**: See the `solid/app/src/main/java/com/ancla/OpenClose.java` directory for examples.
* **Documentation**:
    * [Wikipedia: Open/closed principle](https://en.wikipedia.org/wiki/Open/closed_principle)
    * [Robert C. Martin (Uncle Bob) on OCP](https://blog.cleancoder.com/uncle-bob/2014/05/12/The-Open-Closed-Principle.html)

### 3. Liskov Substitution Principle (LSP)

* **Summary:** Subtypes must be substitutable for their base types without altering the correctness of the program.
* **Why understand it**: LSP ensures that inheritance is used correctly, preventing unexpected behavior when substituting base classes with their derived classes.
* **Example**: See the `solid/app/src/main/java/com/ancla/LiskovSubstitution.java` directory for examples.
* **Documentation**:
    * [Wikipedia: Liskov substitution principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle)
    * [Robert C. Martin (Uncle Bob) on LSP](https://blog.cleancoder.com/uncle-bob/2014/05/13/LiskovSubstitutionPrinciple.html)

### 4. Interface Segregation Principle (ISP)

* **Summary:** Clients should not be forced to depend on interfaces they do not use.
* **Why understand it**: ISP promotes smaller, more focused interfaces, preventing clients from being burdened with unnecessary methods and making your code more maintainable.
* **Example**: See the `solid/app/src/main/java/com/ancla/InterfaceSegregation.java` directory for examples.
* **Documentation**:
    * [Wikipedia: Interface segregation principle](https://en.wikipedia.org/wiki/Interface_segregation_principle)
    * [Robert C. Martin (Uncle Bob) on ISP](https://blog.cleancoder.com/uncle-bob/2014/05/14/InterfaceSegregationPrinciple.html)

### 5. Dependency Inversion Principle (DIP)

* **Summary:**
    * High-level modules should not depend on low-level modules. Both should depend on abstractions.
    * Abstractions should not depend on details. Details should depend on abstractions.
* **Why understand it**: DIP reduces coupling between modules, making your code more flexible and testable. It promotes the use of abstractions, allowing you to easily switch implementations.
* **Example**: See the `solid/app/src/main/java/com/ancla/DependencyInversion.java` directory for examples.
* **Documentation**:
    * [Wikipedia: Dependency inversion principle](https://en.wikipedia.org/wiki/Dependency_inversion_principle)
    * [Robert C. Martin (Uncle Bob) on DIP](https://blog.cleancoder.com/uncle-bob/2014/05/15/The-Dependency-Inversion-Principle.html)

## Contributing

Contributions are welcome! Please feel free to submit pull requests with improvements, additional examples, or corrections.

## License

This project is licensed under the [MIT License](LICENSE).
