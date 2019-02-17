package thread.notify_wait.example_bank;

//инкасатор
public class Collector implements Runnable {
    private long sum;
    private Bank bank;
    public Collector(long sum, Bank bank) {
        this.sum = sum;
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.addMoney(sum);
    }
}
