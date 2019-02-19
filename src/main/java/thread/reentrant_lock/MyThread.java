package thread.reentrant_lock;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {

    ReentrantLock reentrantLock;
    String key;

    public MyThread( ReentrantLock reentrantLock,String count) {
        this.reentrantLock = reentrantLock;
        this.key = count;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            for (int i = 0; i < 4 ; i++) {
                System.out.println("key = " + key + " thread name = " + Thread.currentThread().getName() + " time " + new Date());
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
