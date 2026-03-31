# JAVA-core-oops-multithreading
# ☕ Java Core — OOPs & Multithreading

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Multithreading](https://img.shields.io/badge/Multithreading-Concurrency-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

> A hands-on Java project to practice and demonstrate **Core Java**, **Object-Oriented Programming (OOP)** principles, and **Multithreading / Concurrency** concepts.

---

## 📁 Project Structure

```
JAVA-core-oops-multithreading/
│
├── src/
│   ├── corejava/           # Core Java fundamentals
│   ├── oops/               # OOP concepts & design
│   └── multithreading/     # Threads & concurrency
│
└── README.md
```

---

## 🧩 Core Java Concepts

### 1. Data Types & Variables
- **Primitive types**: `int`, `float`, `double`, `char`, `boolean`, `byte`, `short`, `long`
- **Non-primitive types**: `String`, Arrays, Classes, Interfaces
- **Type casting**: Widening (implicit) and Narrowing (explicit)

### 2. Control Flow
- `if-else`, `switch-case`
- Loops: `for`, `while`, `do-while`, enhanced `for-each`
- Jump statements: `break`, `continue`, `return`

### 3. Arrays
- Single-dimensional and multi-dimensional arrays
- Array manipulation and iteration
- `Arrays` utility class (`Arrays.sort()`, `Arrays.copyOf()`, etc.)

### 4. Strings
- `String` (immutable), `StringBuilder` (mutable, non-thread-safe), `StringBuffer` (mutable, thread-safe)
- Common methods: `charAt()`, `substring()`, `indexOf()`, `equals()`, `compareTo()`, `split()`
- String Pool and interning

### 5. Collections Framework
| Interface | Implementations |
|-----------|----------------|
| `List` | `ArrayList`, `LinkedList`, `Vector` |
| `Set` | `HashSet`, `LinkedHashSet`, `TreeSet` |
| `Map` | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` |
| `Queue` | `PriorityQueue`, `ArrayDeque` |

### 6. Exception Handling
- Checked vs Unchecked exceptions
- `try-catch-finally` blocks
- `throw` and `throws` keywords
- Custom exception classes
- Multi-catch (`catch (IOException | SQLException e)`)

### 7. Java I/O
- `FileReader` / `FileWriter`, `BufferedReader` / `BufferedWriter`
- `InputStream` / `OutputStream`
- Serialization & Deserialization (`Serializable` interface)

### 8. Generics
- Generic classes and methods
- Bounded type parameters (`<T extends Number>`)
- Wildcards (`?`, `? extends T`, `? super T`)

### 9. Java 8+ Features
- **Lambda Expressions**: `(a, b) -> a + b`
- **Stream API**: `filter()`, `map()`, `reduce()`, `collect()`
- **Functional Interfaces**: `Predicate`, `Function`, `Consumer`, `Supplier`
- **Optional**: Avoiding `NullPointerException`
- **Default & Static methods** in interfaces
- **Method References**: `ClassName::methodName`

---

## 🏗️ OOP Concepts

### 1. 🔒 Encapsulation
> Wrapping data (fields) and methods into a single unit (class), hiding internal state.

```java
public class BankAccount {
    private double balance; // private field

    public double getBalance() { return balance; }        // getter
    public void deposit(double amount) { balance += amount; } // setter-like
}
```
- Access modifiers: `private`, `protected`, `public`, default (package-private)
- Getters and Setters
- Data hiding and abstraction of implementation details

---

### 2. 🧬 Inheritance
> A child class acquires properties and behaviors of a parent class.

```java
class Animal {
    void speak() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("Woof!"); }
}
```
- `extends` keyword for class inheritance
- `super` keyword to call parent constructor/methods
- Single, Multilevel, and Hierarchical inheritance
- **Java does NOT support multiple class inheritance** (use interfaces instead)

---

### 3. 🎭 Polymorphism
> One interface, many implementations.

**Compile-time (Method Overloading):**
```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }  // overloaded
}
```

**Runtime (Method Overriding):**
```java
Animal animal = new Dog(); // upcasting
animal.speak();            // calls Dog's speak() at runtime
```

---

### 4. 🎭 Abstraction
> Hiding implementation details and exposing only essential features.

**Abstract Class:**
```java
abstract class Shape {
    abstract double area(); // must be implemented by subclasses

    void display() { System.out.println("Area: " + area()); }
}
```

**Interface:**
```java
interface Drawable {
    void draw(); // implicitly public abstract
}

class Circle extends Shape implements Drawable {
    double radius;
    @Override double area() { return Math.PI * radius * radius; }
    @Override public void draw() { System.out.println("Drawing circle"); }
}
```

---

### 5. 🔗 Other OOP Pillars

| Concept | Description |
|---------|-------------|
| **Association** | A "uses-a" relationship between classes |
| **Aggregation** | A "has-a" weak relationship (child can exist independently) |
| **Composition** | A "has-a" strong relationship (child cannot exist without parent) |
| **Coupling** | Degree of dependency between classes (aim for loose coupling) |
| **Cohesion** | Degree to which a class has a focused responsibility (aim for high cohesion) |

---

### 6. 🧩 Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|---------|-----------|----------------|
| Multiple inheritance | ✅ Yes | ❌ No |
| Constructor | ❌ No | ✅ Yes |
| Fields | Only `public static final` | Any type |
| Method types | Abstract + default + static | Abstract + concrete |
| `implements` / `extends` | `implements` | `extends` |

---

## 🧵 Multithreading & Concurrency

### 1. Creating Threads

**Extending `Thread` class:**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
new MyThread().start();
```

**Implementing `Runnable` interface (preferred):**
```java
class MyTask implements Runnable {
    public void run() { System.out.println("Task running"); }
}
new Thread(new MyTask()).start();

// Or with lambda:
new Thread(() -> System.out.println("Lambda thread")).start();
```

---

### 2. Thread Lifecycle

```
NEW → RUNNABLE → RUNNING → BLOCKED/WAITING/TIMED_WAITING → TERMINATED
```

| State | Description |
|-------|-------------|
| `NEW` | Thread object created, not started |
| `RUNNABLE` | `start()` called, ready to run |
| `RUNNING` | Currently executing |
| `BLOCKED` | Waiting to acquire a monitor lock |
| `WAITING` | Waiting indefinitely (`wait()`, `join()`) |
| `TIMED_WAITING` | Waiting for a specified time (`sleep()`, `wait(timeout)`) |
| `TERMINATED` | Execution completed |

---

### 3. Thread Methods

| Method | Description |
|--------|-------------|
| `start()` | Starts the thread (calls `run()`) |
| `run()` | Thread's task logic |
| `sleep(ms)` | Pauses thread for specified milliseconds |
| `join()` | Waits for thread to finish |
| `yield()` | Hints scheduler to let other threads run |
| `interrupt()` | Interrupts a sleeping/waiting thread |
| `isAlive()` | Checks if thread is still running |
| `setPriority(n)` | Sets priority (1–10, default 5) |

---

### 4. Synchronization

**Problem — Race Condition:**
```java
class Counter {
    int count = 0;
    void increment() { count++; } // NOT thread-safe!
}
```

**Solution — `synchronized` keyword:**
```java
class Counter {
    int count = 0;
    synchronized void increment() { count++; } // thread-safe
}
```

**Synchronized block (finer control):**
```java
void increment() {
    synchronized (this) {
        count++;
    }
}
```

---

### 5. `wait()`, `notify()`, `notifyAll()`
> Used for inter-thread communication (must be called inside `synchronized` block).

```java
synchronized (lock) {
    while (conditionNotMet) lock.wait();  // releases lock and waits
    // ... do work
    lock.notifyAll(); // wake up all waiting threads
}
```

---

### 6. `volatile` Keyword
> Ensures visibility of variable changes across threads (no caching in CPU registers).

```java
private volatile boolean running = true;
```

---

### 7. `Callable` & `Future`
> Like `Runnable` but can return a result and throw checked exceptions.

```java
Callable<Integer> task = () -> { return 42; };
ExecutorService executor = Executors.newSingleThreadExecutor();
Future<Integer> future = executor.submit(task);
System.out.println(future.get()); // blocks until result is ready
executor.shutdown();
```

---

### 8. Executor Framework
```java
// Fixed thread pool
ExecutorService pool = Executors.newFixedThreadPool(4);
pool.submit(() -> System.out.println("Task 1"));

// Scheduled executor
ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
```

---

### 9. `java.util.concurrent` Utilities

| Class / Interface | Purpose |
|-------------------|---------|
| `ReentrantLock` | Explicit lock with more control than `synchronized` |
| `ReadWriteLock` | Allows multiple readers, exclusive writer |
| `Semaphore` | Controls access to a fixed number of permits |
| `CountDownLatch` | Waits until N operations complete |
| `CyclicBarrier` | Waits until N threads reach a common point |
| `ConcurrentHashMap` | Thread-safe HashMap |
| `BlockingQueue` | Thread-safe queue with blocking operations |
| `AtomicInteger` | Lock-free atomic integer operations |

---

### 10. Common Concurrency Problems & Solutions

| Problem | Description | Solution |
|---------|-------------|----------|
| **Race Condition** | Multiple threads access shared data unsafely | `synchronized`, `AtomicInteger` |
| **Deadlock** | Two threads wait on each other's lock forever | Lock ordering, `tryLock()` |
| **Starvation** | A thread never gets CPU time | Fair locks, thread priority |
| **Livelock** | Threads keep reacting to each other, no progress | Randomized backoff |

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above
- Any IDE (IntelliJ IDEA / Eclipse / VS Code) or command line

### Clone the Repository
```bash
git clone https://github.com/KSHITIZMISHRA31/JAVA-core-oops-multithreading.git
cd JAVA-core-oops-multithreading
```

### Compile & Run
```bash
# Compile a file
javac src/oops/InheritanceDemo.java

# Run a class
java -cp src oops.InheritanceDemo
```

---

## 🛠️ Technologies Used

- **Language**: Java (JDK 8+)
- **Concepts**: Core Java, OOP, Multithreading, Concurrency
- **Tools**: IntelliJ IDEA / Eclipse, Git

---

## 📚 Learning Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Effective Java — Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
- [Java Concurrency in Practice — Brian Goetz](https://jcip.net/)

---

## 👤 Author

**Kshitiz Mishra**
- GitHub: [@KSHITIZMISHRA31](https://github.com/KSHITIZMISHRA31)

---