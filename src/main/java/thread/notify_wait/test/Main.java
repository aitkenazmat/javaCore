package thread.notify_wait.test;

public class Main {
    public static void main(String[] args) {

        new Thread(new MyThread1("dddd"), "MyThread1").start();
        new Thread(new MyThread1("dddd"), "MyThread1").start();
        new Thread(new MyThread2(),"MyThread2").start();

    }
}
