package thread.synch;

public class Program {
    public static void main(String[] args) {
        CommonResource commonResource= new CommonResource();

        Thread t1 = new Thread(new CountThread(commonResource),"Thread 1");
        Thread t2 = new Thread(new CountThread(commonResource),"Thread 2");
        t1.start();
        t2.start();

//        for (int i = 1; i < 6; i++){
//
//            Thread t = new Thread(new CountThread(commonResource));
//            t.setName("Thread "+ i);
//            t.start();
//        }
    }
}
