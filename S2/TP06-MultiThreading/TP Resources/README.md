# Multithreading in Java

Multithreading in Java allows multiple threads to run concurrently, enhancing the performance of programs by making efficient use of CPU resources. Each thread represents a separate path of execution, and Java provides built-in support for creating and managing threads.

### *1.Creating Threads:*
#### 1.1 Using the "thread" class: 

The Thread class provides constructors and methods to create and perform operations on a thread. To create a thread by extending the Thread class, follow these steps:

1- Extend Thread:
Create a class that extends the Thread class.
Override the run method to define the code that will be executed by the thread.

```java
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

```

2- Create and Start the Thread

Instantiate the class.
Call the start method on the instance to begin execution.

```java
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
```

#### 1.2 Using the Runnable Interface:

The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. This approach is more flexible because the class implementing Runnable can extend another class.

1- Implement Runnable:
Create a class that implements the Runnable interface.
Override the run method to define the code that will be executed by the thread.

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
```

2- Create and Start a Thread:
Instantiate the Runnable class.
Pass the Runnable instance to a Thread object.
Call the start method on the Thread object to begin execution.

```java
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```

### *2. Synchronized Methods:*

Synchronization in Java is a mechanism to control the access of multiple threads to shared resources. This is essential to avoid issues like data inconsistency and race conditions. The synchronized keyword can be used to ensure that only one thread can execute a particular piece of code at a time.

### *3. Example: Deposit and Withdraw from a Bank Account*
#### 3.1 Define the Bank Account Class:
Create a class BankAccount with methods to deposit and withdraw money.
Use the synchronized keyword to ensure that only one thread can execute these methods at a time.

```java
class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Current balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but only " + balance + " available.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

```

#### 3.2 Define the Bank Account Class:

Create Threads to Perform Operations:

```java
class DepositRunnable implements Runnable {
    private BankAccount account;
    private int amount;

    public DepositRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawRunnable implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

```

#### 3.3 Main Method to Test Synchronization:

Create instances of the DepositRunnable and WithdrawRunnable classes.
Create and start threads for each operation.


```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new DepositRunnable(account, 500));
        Thread t2 = new Thread(new WithdrawRunnable(account, 300));
        Thread t3 = new Thread(new WithdrawRunnable(account, 700));
        Thread t4 = new Thread(new DepositRunnable(account, 200));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

```