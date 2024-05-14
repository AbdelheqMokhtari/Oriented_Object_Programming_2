public class Main {
    public static void main(String[] args) {
        IncrementThread thread1 = new IncrementThread("Thread 1");
        IncrementThread thread2 = new IncrementThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("Final Counter Value: " + IncrementThread.getCounterValue());
    }
}
