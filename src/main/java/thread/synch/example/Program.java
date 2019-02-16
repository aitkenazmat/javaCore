package thread.synch.example;

import java.util.LinkedList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("11");
        MyThread myThread2 = new MyThread("11");
        MyThread myThread3 = new MyThread("11");

        MyThread myThread4 = new MyThread("14");
        MyThread myThread5 = new MyThread("15");
        MyThread myThread6 = new MyThread("16");
        List<MyThread> myThreadList = new LinkedList<>();
        myThreadList.add(myThread1);
        myThreadList.add(myThread2);
        myThreadList.add(myThread3);
        myThreadList.add(myThread4);
        myThreadList.add(myThread5);
        myThreadList.add(myThread6);


        for (int i = 0; i < myThreadList.size() ; i++) {
            new Thread(myThreadList.get(i)).start();
        }

    }
}
