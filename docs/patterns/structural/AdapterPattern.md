# Adapter Pattern

The Adapter is a structural design pattern that allows objects with incompatible interfaces to work together.

It works like a converter or plug adapter, translating one interface into another.

### Why do we need it?
- When we want to use an existing class, but its interface doesn't match what the client code expects.
- To make old code compatible with new code without modifying the old code.
- To connect multiple systems so they can work together through a unified interface.

### Structure
- **Target (target interface)** — the interface the client code expects to work with.
- **Adaptee (adapted class)** — the existing class whose interface is incompatible with the target.
- **Adapter** — the class that translates requests from the Target interface into calls to the Adaptee.
