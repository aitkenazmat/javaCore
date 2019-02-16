package thread.synch.example;

import java.util.Date;

public class MyThread implements Runnable {
    private String key;
    public MyThread(String key) {
        this.key = key;
    }

    @Override
    public void run() {
        synchronized (key) {
            System.out.printf("thread name=%s key=%s %tc \n", Thread.currentThread().getName(), key,new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
