
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String []args){
        var currentThread = Thread.currentThread();
        printThreadInfo(currentThread);
        CustomThread myThread = new CustomThread();
        myThread.start();

        Runnable myThread2 = () ->{
          for(int i=0;i<5;i++){
              System.out.println(" 2 ");
              try {
                  TimeUnit.MILLISECONDS.sleep(500);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Thread myThread3 = new Thread(myThread2);
        myThread3.start();
        for(int i=0;i<5;i++){
            System.out.println(" 0 ");
            try {
                TimeUnit.MILLISECONDS.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void printThreadInfo(Thread thread){
        System.out.println("-------------");
        System.out.println("Thread ID :" + thread.getId());
        System.out.println("Thread Name :" + thread.getName());
        System.out.println("Thread Priority : "+ thread.getPriority());
        System.out.println("Thread alive : "+ thread.isAlive());
        System.out.println("Thread state :" + thread.getState());
    }
}
