# Prototype Pattern

A pattern that creates new objects by copying existing instances instead of using `new`.

How it works:
- We have a Prototype object that knows how to clone itself.
- Instead of calling `new()`, we call `clone()` or `copy()`.
- This returns a copy that can be modified without affecting the original.

Why we need it:
- To efficiently clone complex or heavy objects.
- To avoid expensive object creation when the object is expensive to construct.

Shallow copy VS deep copy:
- Shallow copy copies the object, but shared references remain.
- Deep copy copies the object and its internal objects.

Note:
- No deep copy is needed for simple types like enums or immutable classes in Java.
