# Factory Method Pattern

The **Factory Method Pattern** delegates the object creation process to subclasses.

## Use Cases
- When creating many types of `Notification` without knowing the implementation details.
- When developing a file parser that supports multiple file extensions.
- When creating different types of roles (e.g., `Admin`, `User`, `Guest`).

## Core Idea

An **interface** or **parent class** defines a method for creating an object, but the **subclasses implement** how the object is created.
