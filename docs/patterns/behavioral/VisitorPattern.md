# Visitor Pattern

The Visitor pattern allows adding new operations to a group of objects **without modifying their classes**.

## When to use:
- When we have complex objects of different types and want to add new operations without changing their code.
- When we need to **separate data structures from algorithms** that operate on them.
- When we need to process objects that belong to **the same class hierarchy**.

All elements that can be "visited" by a Visitor must implement a common interface or inherit from a common abstract class.  
This is required because Visitor relies on **polymorphism**: each element must expose an `accept(visitor)` method to allow the Visitor to access it.

Without this shared interface, the Visitor cannot traverse and operate on all objects in a unified way.
