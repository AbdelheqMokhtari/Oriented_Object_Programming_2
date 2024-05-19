# Interfaces in Java
Interfaces in Java are a way to define a contract that classes must follow. They specify methods that a class must implement but do not provide any implementation themselves. Interfaces are used to achieve abstraction and multiple inheritance.

### *1.Declaration of an Interface:*

To declare an interface, use the interface keyword. An interface can contain abstract methods and default methods (methods with a body).

```java
public interface Animal {
    void makeSound(); // Abstract method
    void eat(); // Abstract method
}
```

### *2. Implementing Interfaces:*

A class implements an interface using the implements keyword. The class must provide implementations for all abstract methods defined in the interface.

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
```

### *3. Using Multiple Interfaces:*

A class can implement multiple interfaces, providing implementations for all methods defined in the interfaces.

```java
public interface Runnable {
    void run();
}

public interface Swimmable {
    void swim();
}

public class Duck implements Animal, Runnable, Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
```


### *4. Practical Example: Interfaces in Action:*
#### 4.1 Define an Interface:
Here, we define an interface Shape with methods for calculating area and perimeter..
```java
public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

```
#### 4.2 Implement the Interface:
We create two classes Circle and Rectangle, each implementing the Shape interface.
```java

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

```
#### 5.3 Using the Implementations::
We create instances of Circle and Rectangle and call their methods.

```java
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
    }
}
```

