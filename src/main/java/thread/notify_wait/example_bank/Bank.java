package thread.notify_wait.example_bank;

public class Bank {
    private long totalBalance = 1000_000;
    private long sumWichNeed;

    public synchronized void getMoney(long sum) {
        this.sumWichNeed = sum;
        if ( sum>totalBalance) {
            System.out.println("Bank needs money!!!!!!!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        totalBalance = totalBalance - sum;

        System.out.printf("Клиент получл деньги в размере %d имя клиента %s  \n ", sum , Thread.currentThread().getName());
        System.out.printf("В банке осталось %d \n", this.totalBalance);
        System.out.println("---------------------------------------------------------------------");
        notifyAll();
    }

    public synchronized void addMoney(long sum) {

        System.out.println("Client request " + sumWichNeed);

        if (totalBalance>0 && totalBalance>sumWichNeed){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        totalBalance = totalBalance + sum;
        System.out.printf("баланс был заполнен на сумму %d имя инсксатора %s  \n", sum, Thread.currentThread().getName());
        System.out.printf("Обшии баланс составляет %d \n", this.totalBalance);
        System.out.println("***************************************************************************");
        notifyAll();
    }
}
