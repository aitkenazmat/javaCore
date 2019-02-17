package thread.notify_wait.test;

public class MyThread2 implements Runnable {
    @Override
    public void run() {

        synchronized ("33333"){
            System.out.println("MyThread2 started work............");
        }

    }
}
