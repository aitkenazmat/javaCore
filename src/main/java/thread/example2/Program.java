package thread.example2;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread myThread1 = new Thread(new MyThread(),"MyThread1");
        Thread myThread2 = new Thread(new MyThread(),"MyThread2");
        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished...");
    }
}
