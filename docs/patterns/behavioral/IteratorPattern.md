# Iterator Pattern

The Iterator pattern allows us to iterate over a collection  
without exposing its internal structure.

# The Idea
- **Iterator** — an object that tracks the current position during traversal.
- **Collection** — an object that provides an iterator.
- **Client code** — works only with the iterator, not with collection details.

# How to Create It
- The collection has a method `iterator()` that returns an `Iterator`.
- The iterator has:
  - `next()` — moves to the next element.
  - `hasNext()` — checks if a next element exists.
  - (optional) `remove()` — removes the current element.

# Why We Use It
- To hide complex internal structures.
- To unify iteration logic across different collections.
- To write code that works with various collection types.

# Note on Iterator and Iterable
- **Iterable** is an interface that defines a collection which can return an iterator using the `iterator()` method.
- **Iterator** is an interface that provides methods (`next()`, `hasNext()`, and optionally `remove()`) to traverse the collection.
