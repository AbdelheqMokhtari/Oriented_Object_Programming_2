import java.util.concurrent.TimeUnit;

public class CustomThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(" 1 ");
            try {
                TimeUnit.MILLISECONDS.sleep(250);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
