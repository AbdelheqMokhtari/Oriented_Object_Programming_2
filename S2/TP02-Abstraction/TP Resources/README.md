# Abstract Classes in Java
Abstract classes are used in Java to define common characteristics and behavior that multiple subclasses can inherit. An abstract class cannot be instantiated on its own and often includes one or more abstract methods, which must be implemented by any non-abstract subclasses (concert class).

### *1.Declaration of an Abstract Class:*

To declare an abstract class, you use the abstract keyword before the class keyword. An abstract class can have both abstract methods (without a body) and regular methods (with a body).
```java
public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
```

### *2.Creating a SubClass:*

Subclasses of an abstract class must provide implementations for all abstract methods of the superclass. If a subclass does not implement all abstract methods, it must also be declared abstract.

```java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

### *3. Using Abstract Classes:*

While you cannot instantiate an abstract class directly, you can create instances of its subclasses.

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Outputs: Woof
        dog.sleep();     // Outputs: Sleeping...

        Animal cat = new Cat();
        cat.makeSound(); // Outputs: Meow
        cat.sleep();     // Outputs: Sleeping...
    }
}
```

### *4. Abstract Methods and Polymorphism:*

Abstract classes are often used in combination with polymorphism. This allows you to use a superclass reference to refer to a subclass object, providing a way to call subclass methods through the superclass reference.

```java
public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
```

### *5. Practical Example: Abstract Classes in Action:*
#### 5.1 Define an Abstract Class:
Here, we define an abstract class Shape with an abstract method **calculateArea()** and a regular method **displayShapeType()**.
```java
public abstract class Shape {
    public abstract double calculateArea();

    public void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

```
#### 5.2 Subclasses Implementing Abstract Methods:
We create two subclasses **Circle** and **Rectangle**, each implementing the **calculateArea() method**.
```java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
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
}
```
#### 5.3 Using Subclasses:
We create instances of Circle and Rectangle and call their methods.

```java
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());
        circle.displayShapeType(); // This will output: This is a shape.

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        rectangle.displayShapeType(); // This will output: This is a shape.
    }
}

```

