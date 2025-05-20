# Flyweight Pattern

**What is it?**  
A pattern that reduces memory usage by reusing identical objects instead of creating new ones.

---

## When to use it?
- When the system has many identical objects.

---

## Intrinsic vs Extrinsic state
- **Intrinsic:** shared, immutable data stored inside the Flyweight.
- **Extrinsic:** unique data passed during method calls, not stored in the Flyweight.

---

## How to manage Flyweight objects?
- Using a factory that stores and returns shared Flyweight instances.

---

## Is Flyweight thread-safe?
- No, not by default. Synchronization is needed for multithreaded access.
