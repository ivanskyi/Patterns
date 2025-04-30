# Chain of Responsibility

The Chain of Responsibility pattern allows a request to pass through a chain of handlers, where each handler decides 
whether to process the request or pass it on to the next handler in the chain.

## The Idea
- Each handler in the chain decides independently whether it can handle the request.
- If a handler cannot process the request, it passes the request to the next handler in the chain.
- The request continues down the chain until it is either handled or reaches the end of the chain.

## When to Use It
- To reduce the dependency on concrete handlers, allowing you to decouple the sender from the specific handler.
- To provide flexibility in adding new handlers without affecting the existing ones.
- To dynamically improve or change the request handling process by modifying the chain.
