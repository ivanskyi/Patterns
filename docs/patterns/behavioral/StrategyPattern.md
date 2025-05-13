## Strategy Pattern

### When to Use
- When a class needs to support multiple interchangeable behaviors (filtering, sorting).
- When you want to eliminate conditional logic (`if`, `switch`) for behavior selection.

### Real-World Example
In a payment system, a user can choose between debit card, PayPal, or Google Pay. Each method has its own implementation 
but follows a common interface (`pay()`).

### Main Elements
- **Strategy**: An interface or abstract class that defines a common behavior.
- **ConcreteStrategy**: Classes that implement the strategy with specific algorithms.
- **Context**: The class that uses a `Strategy` and delegates behavior to it.
- **Client**: Code that creates a `ConcreteStrategy` and provides it to the `Context`.
