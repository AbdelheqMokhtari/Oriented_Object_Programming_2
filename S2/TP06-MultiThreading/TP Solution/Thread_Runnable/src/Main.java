public class Main {
    public static void main(String []args){

        // Creating two instances of CounterThread
        CounterThread thread1 = new CounterThread();
        CounterThread thread2 = new CounterThread();

        // Starting both threads
        thread1.start();
        thread2.start();


        // Creating two instances of Counter
        CounterRunnable counter1 = new CounterRunnable();
        CounterRunnable counter2 = new CounterRunnable();

        // Creating two Thread objects, passing each Counter instance to their constructors
        Thread thread3 = new Thread(counter1);
        Thread thread4 = new Thread(counter2);

        // Starting both threads
        thread3.start();
        thread4.start();
    }
}
