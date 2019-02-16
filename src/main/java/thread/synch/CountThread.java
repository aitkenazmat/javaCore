package thread.synch;

import java.util.Date;

public class CountThread implements Runnable {

    CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {
//        synchronized (res) {
//            res.x=1;
//            for (int i = 1; i < 5; i++){
//                System.out.printf("%s %d %tc \n", Thread.currentThread().getName(), res.x, new Date());
//                res.x++;
//                try{
//                    Thread.sleep(1000);
//                }
//                catch(InterruptedException e){}
//            }
//        }

        res.x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d %tc \n", Thread.currentThread().getName(), res.x, new Date());
            res.x++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
