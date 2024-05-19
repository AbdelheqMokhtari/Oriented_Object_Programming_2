# Exception Handling in Java

Exception handling in Java allows a program to handle runtime errors and maintain normal application flow. Exceptions are events that disrupt the normal flow of the program. The main keywords used in exception handling are try, catch, throw, throws, and finally

### *1.Try-Catch Blocks:*
#### 1.1 The try Block:
The try block contains the code that might throw an exception. If an exception occurs, the execution stops and jumps to the corresponding catch block.
```java
try {
    // Code that may throw an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Handling exception
    System.out.println("Cannot divide by zero");
}
```

#### 1.2 The catch Block:
The catch block contains the code to handle the exception. It must immediately follow the try block.

```java
try {
    // Code that may throw an exception
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    // Handling exception
    System.out.println("Array index out of bounds");
}
```
### *2. the finally block:*

The finally block is optional and always executes, regardless of whether an exception was thrown or not. It's typically used for cleanup code.
```java
try {
    // Code that may throw an exception
    int result = 10 / 2;
} catch (ArithmeticException e) {
    // Handling exception
    System.out.println("Arithmetic exception");
} finally {
    // Cleanup code
    System.out.println("This is the finally block");
}
```
### *3.The throw Keyword:*

The throw keyword is used to explicitly throw an exception. This can be useful for creating custom exceptions or throwing predefined exceptions.

ex: 

```java
public class TestThrow {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // This will throw an exception
    }
}

```

### *4.The throws Keyword:*

The throws keyword is used in method signatures to indicate that the method might throw certain exceptions. It informs the caller of the method to handle these exceptions.

```java
public class TestThrows {
    // Method signature with throws keyword
    static void checkFile() throws FileNotFoundException {
        FileReader file = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            checkFile(); // Calling method that may throw exception
        } catch (FileNotFoundException e) {
            // Handling exception
            System.out.println("File not found");
        }
    }
}
```

### *5.Creating Custom Exceptions:*

You can create your own exceptions by extending the Exception class.

ex: 
```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class TestCustomException {
    static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

```

### *6.Multiple Catch Blocks:*

You can have multiple catch blocks to handle different types of exceptions separately.

```java
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        } catch (Exception e) {
            System.out.println("Some other exception");
        }
    }
}
```
