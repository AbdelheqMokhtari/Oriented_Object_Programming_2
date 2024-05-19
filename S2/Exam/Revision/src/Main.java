public class Main {
    public static void main(String []args){
        // implementation with class Thread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        // Implementation with interface Runnable

        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        Thread thread = new Thread(runnable1);
        Thread thread3 = new Thread(runnable2);

        thread.start();
        thread3.start();

    }
}
