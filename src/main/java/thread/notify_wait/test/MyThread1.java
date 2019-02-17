package thread.notify_wait.test;

public class MyThread1 implements Runnable {
    private String key;
    public MyThread1(String key) {
        this.key = key;
    }

    @Override
    public void run() {
       synchronized (key) {
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           System.out.println("MyThread1 started worked.......................");
           notify();
       }
    }
}
