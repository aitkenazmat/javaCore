package thread.exchanger;


import java.util.concurrent.Exchanger;

public class PutThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger<String> ex){
        this.exchanger=ex;
        message = "Hello Java!";
    }


    @Override
    public void run() {
        try{
            message=exchanger.exchange(message);
            System.out.println("PutThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
