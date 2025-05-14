# Decorator Pattern

The **Decorator Pattern** is a structural design pattern that allows you to dynamically 
add new functionality to objects **without modifying their existing code**. This is achieved 
by wrapping the object with a decorator, which implements the same interface and adds extra behavior.

## Main Elements

- **Component Interface**: A common interface for both the core class and its decorators.
- **Concrete Component**: The original class whose behavior we want to extend.
- **Base Decorator**: Implements the component interface and holds a reference to another component object.
- **Concrete Decorators**: Extend the base decorator and add specific behavior before or after delegating to the wrapped object.

## When to Use

- When you want to add responsibilities to individual objects without affecting other instances.
- To follow the **Open/Closed Principle** — open for extension, but closed for modification.
- When subclassing would lead to an explosion of classes for every combination of features.

## Disadvantages

- Can result in many small classes that are harder to manage and understand.
- The wrapping (decoration) structure can become complex and difficult to trace.
