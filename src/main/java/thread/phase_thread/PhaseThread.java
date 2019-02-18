package thread.phase_thread;


import java.util.concurrent.Phaser;

public class PhaseThread implements Runnable {

    Phaser phaser;
    String name;

    public PhaseThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что первая фаза достигнута
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что вторая фаза достигнута
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndDeregister(); // сообщаем о завершении фаз и удаляем с регистрации объекты
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
