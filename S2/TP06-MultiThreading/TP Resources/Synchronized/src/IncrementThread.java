public class IncrementThread extends Thread {
    private static int counter = 0;
    private String threadName;

    public IncrementThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is incrementing the counter.");
        for (int i = 0; i < 1000; i++) {
            incrementCounter();
        }
        System.out.println("Thread " + threadName + " finished incrementing.");
    }

    private synchronized void incrementCounter() {
        counter++;
    }

    public static int getCounterValue() {
        return counter;
    }
}

