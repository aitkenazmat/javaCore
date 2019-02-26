package thread.reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class Program {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new MyThread(reentrantLock,"key1"),"Thread-1").start();
        new Thread(new MyThread(reentrantLock,"key2"),"Thread-2").start();
    }
}
