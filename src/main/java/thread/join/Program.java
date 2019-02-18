package thread.join;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");
        JThread t1 = new JThread("JThread1");
        JThread t2 = new JThread("JThread2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main thread finished...");

    }
}
