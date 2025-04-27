# Builder Pattern

The **Builder Pattern** is designed to simplify the creation process, especially when an object has many fields.

Instead of using a single constructor with numerous parameters, the Builder pattern allows you to create an object step-by-step, setting only the data you actually need.

## Use Cases
- When an object has many required and optional fields.
- When we want to avoid constructors with too many parameters.
- When we want to achieve readable and maintainable object creation code.

## Types of Builder Pattern
- **Classical Builder** – Separate builder class with step-by-step object construction.
- **Fluent Builder** – Method chaining to improve readability.
- **Nested Builder** – Builder is implemented as a static inner class.
- **Hierarchical Builder** – For handling inheritance structures.
- **Functional Builder** – Using functional programming style (e.g., lambdas) for building.
- **Lombok Builder** – Automatic builder generation using `@Builder` annotation.

## Core Idea
Build complex objects step-by-step in a flexible, readable, and controlled manner.
