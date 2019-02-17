package thread.notify_wait.example_bank;


public class Run {

    public static void main(String[] args) {

        Bank kazKom = new Bank();

        Thread thread1 = new Thread(new Client(300_000, kazKom),"aza");
        Thread thread2 = new Thread(new Client(200_000, kazKom),"ara");
        Thread thread3 = new Thread(new Client(500_000, kazKom),"beka");
        Thread collectorThread1 = new Thread(new Collector(700_000,kazKom),"collectorThread1");
        Thread collectorThread2 = new Thread(new Collector(700_000,kazKom),"collectorThread2");


        thread1.start();
        thread2.start();
        thread3.start();
        collectorThread1.start();
        collectorThread2.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();



    }
}
