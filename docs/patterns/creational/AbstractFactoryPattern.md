# Abstract Factory Pattern

The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Structure:
- **Abstract Factory**: Declares methods for creating abstract products.
- **Concrete Factory**: Implements the abstract factory for a specific product family.
- **Abstract Product**: Defines operations for products.
- **Concrete Product**: A specific implementation of an abstract product.
- **Client**: Uses the factory to create objects without knowing their concrete types.

## Difference Between Factory Method and Abstract Factory:
- **Factory Method**: Creates a single product.
- **Abstract Factory**: Creates families of related products.
