package thread.notify_wait;

/**
 * Created by WWW on 17.02.2019.
 */
public class Consumer implements Runnable {
    Store store;
    Consumer(Store store){
        this.store=store;
    }

    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}
