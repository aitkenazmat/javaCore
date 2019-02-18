package thread.semaphore.example;

import java.util.concurrent.Semaphore;

public class Program {
    public static void main(String[] args) {

        Semaphore sem  = new Semaphore(2);
        new Thread(new MyThread1("key1", sem ),"Thread-0").start();
        new Thread(new MyThread1("key1", sem ),"Thread-1").start();
        new Thread(new MyThread1("key3", sem ),"Thread-2").start();
        new Thread(new MyThread1("key4", sem ),"Thread-3").start();
        new Thread(new MyThread1("key5", sem ),"Thread-4").start();
        new Thread(new MyThread1("key6", sem ),"Thread-5").start();
    }
}

