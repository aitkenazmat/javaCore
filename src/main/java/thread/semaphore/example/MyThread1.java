package thread.semaphore.example;


import java.util.Date;
import java.util.concurrent.Semaphore;

public class MyThread1 implements Runnable {

    private String key;
    private Semaphore semaphore;

    public MyThread1(String key, Semaphore semaphore) {
        this.key = key;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        try {
            semaphore.acquire();
            Thread.sleep(1000);
            synchronized (key) {
                System.out.println( "thread name: " + Thread.currentThread().getName() + " key was updated " + key + " time : " + new Date() );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();

    }
}
