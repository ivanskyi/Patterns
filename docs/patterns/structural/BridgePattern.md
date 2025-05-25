# Bridge Pattern

**Intent:**  
Decouple an abstraction from its implementation so that the two can vary independently.

---

## Structure

- **Abstraction** – defines the high-level control interface; maintains a reference to Implementor
- **Refined Abstraction** – extends Abstraction with additional features
- **Implementor** – defines the low-level interface for implementation
- **ConcreteImplementor** – provides a specific implementation of the Implementor interface

---

## When to Use

- When you want to separate abstraction from implementation
- When both abstraction and implementation may need to be extended independently
- When changes to the implementation should not affect the client code using the abstraction
- When you want to avoid a combinatorial explosion of subclasses from multiple dimensions of variation
