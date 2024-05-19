# Lists in Java
### *1. Lists Declaration :*
Lists are part of the java.util package and to use them you need to import List 

```java
import java.util.List;
```
there many lists in java here an overview of some commonly used list classes in Java: 

#### 1.1 Arraylist: 
This is one of the most commonly used implementations of the List interface. It internally uses an array to store elements and provides dynamic resizing, meaning it can grow and shrink as needed. To use an **ArrayList**, you first import it:

```java
import java.util.ArrayList;
```

Then, you can create an **ArrayList** : 

```java
List<String> names = new ArrayList<>();
```

#### 1.2 LinkedList: 
This is another implementation of the List interface. Unlike **ArrayList**, which uses an array, **LinkedList** uses a doubly linked list internally. It provides fast insertion and deletion operations at the cost of slower random access. Here's how you can use **LinkedList**:

```java
import java.util.LinkedList;
```

Then, you can create an **LinkedList** : 

```java
List<String> names = new LinkedList<>();
```
### *2. Adding elements to a list :*

You can add elements to the ArrayList or LinkedList using the **add() method**. The elements are added to the end of the list by default.

```java
List<Intger> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
```

our list now contains: 

> numbers = [10, 20, 30]


### *3. Getting elements from a list :*
#### 3.1 Get elements by index:
You can retrieve an element from the ArrayList or LinkedList using its index with the **get(index) method**. Remember that indexes in Java are zero-based, so the first element is at index 0, the second at index 1, and so on. 

```java
int secondNumber = numbers.get(1); 
System.out.println("The second number in the is : " + secondNumber)
```
the output of this code:

> The second number in the is : 20 

#### 3.2 Iterating Over elements:

To access all elements in the ArrayList or LinkedList, you can use a loop. For example, a for loop can be used to iterate over the elements and perform some action with each element.

```java
for (int number : numbers) {
    System.out.println(number);
}
```

the output of this code:

> 10
> 20
> 30

### *4. Getting the length of a list:*

To get the length (number of elements) of the ArrayList or LinkedList, use the **size() method**. This method returns an integer representing the number of elements in the list.

```java
    System.out.println("The size of the list : " + numbers.size());
```

the output of this code:

> The size of the List : 3

### *5. Check if the list is empty:*
#### 5.1 using isEmpty() method:

The **isEmpty() method** checks if the list has no elements and returns true if it's empty, false otherwise.

```java
    if (numbers.isEmpty()) {
        System.out.println("The list is empty");
    } else {
        System.out.println("The list is not empty");
    }

```

the output of this code:

> The list is not empty

#### 5.2 using size() method:

Alternatively, you can check if the list is empty by comparing its size to zero using the **size() method**.

```java
    if (numbers.isEmpty()) {
        System.out.println("The list is empty");
    } else {
        System.out.println("The list is not empty");
    }

```

the output of this code:

> The list is not empty

### *6. Removing Elements from a List in Java*
#### 6.1 Removing Elements by Index: 
You can remove an element from the list by its index using the **remove(index) method**. This method removes the element at the specified index and shifts subsequent elements to the left.

```java
numbers.remove(1);
System.out.println("the list after removing the 1-element : [ " );
for(int number:numbers){
    System.out.print(number + " ");
}
System.out.print("]");

```

the output of this code:

> [ 10 30 ]

#### 6.2 Removing Elements by Object:
To remove an element by its value, use the **remove(Object) method**. This method removes the first occurrence of the specified element from the list.

```java
numbers.remove(Integer.valueOf(30));
System.out.println("the list after removing the 1-element : [ " );
for(int number:numbers){
    System.out.print(number + " ");
}
System.out.print("]");

```

the output of this code:

> [ 10 ]