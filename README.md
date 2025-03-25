# Design Patterns Revision Sheet

| **Design Pattern**        | **Description** | **Common LLD Use Cases** |
|--------------------------|----------------|--------------------------|
| **Singleton** | Ensures a class has only one instance and provides a global access point. | Logging service, Database connection pool, Configuration manager |
| **Factory Method** | Defines an interface for creating an object but allows subclasses to alter the type of object that will be created. | Payment gateways, Notification senders (Email/SMS/Push) |
| **Abstract Factory** | Provides an interface for creating families of related objects without specifying their concrete classes. | UI component creation for different platforms (Windows, Mac, Linux), Database connections |
| **Builder** | Separates object construction from its representation to allow step-by-step creation. | Creating complex objects like HTTP requests, SQL queries, or API response objects |
| **Prototype** | Creates new objects by copying an existing object instead of creating from scratch. | Cloning game characters, Configurations, Document versioning |
| **Adapter** | Converts the interface of a class into another interface clients expect. | Integrating third-party payment gateways, Connecting legacy code with new implementations |
| **Decorator** | Allows behavior to be added to an individual object dynamically without modifying its structure. | Adding features to UI components (like scrollbars, borders), Middleware in web requests (Logging, Authentication) |
| **Proxy** | Provides a surrogate or placeholder for another object to control access to it. | Implementing lazy loading, Access control in database connections, API rate limiting |
| **Composite** | Composes objects into tree structures to represent part-whole hierarchies. | File system representations, Organization hierarchies, UI component trees |
| **Flyweight** | Minimizes memory usage by sharing as much data as possible between similar objects. | Caching database connections, Large-scale text editors (glyphs reuse), Game character attributes (common textures) |
| **Facade** | Provides a simplified interface to a larger body of code. | Wrapping complex subsystems (e.g., payment processing), Providing simple API access to multiple services |
| **Bridge** | Decouples abstraction from its implementation, allowing both to evolve independently. | Implementing multiple payment modes with different providers, Separating UI rendering from data sources |
| **Strategy** | Defines a family of algorithms, encapsulates each one, and makes them interchangeable. | Payment processing with different discount strategies, Routing algorithms in navigation apps |
| **Observer** | Defines a dependency between objects so that when one changes, all dependents are notified. | Event-driven systems, Notification systems, Stock price updates in trading apps |
| **Command** | Encapsulates a request as an object, allowing parameterization and queuing. | Undo/Redo in text editors, Task scheduling, Remote control commands |
| **Memento** | Captures and restores an object's state without violating encapsulation. | Implementing undo functionality, Saving game states |
| **State** | Allows an object to alter its behavior when its internal state changes. | ATM operations (Idle, Card Inserted, Pin Entered), Order processing (Pending, Shipped, Delivered) |
| **Chain of Responsibility** | Passes requests along a chain of handlers where each one decides to process or pass it further. | Logging frameworks, Authentication and authorization filters, Support ticket escalation |
| **Template Method** | Defines the skeleton of an algorithm, allowing subclasses to implement specific steps. | Report generation workflows, Payment processing steps, Game AI behaviors |
| **Mediator** | Centralizes communication between objects to avoid direct dependencies. | Chat room implementation, Workflow engines, Messaging systems |
| **Interpreter** | Defines a grammar for interpreting expressions. | SQL query parsing, Expression evaluation in calculators |
| **Visitor** | Separates an algorithm from the object structure it operates on. | Code analysis tools (AST traversal), Applying operations on document elements |
