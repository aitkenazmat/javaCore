package thread.notify_wait.example_bank;


//client
public class Client implements Runnable {
    private long sum;
    private Bank bank;

    public Client(long sum, Bank bank) {
        this.sum = sum;
        this.bank = bank;
    }

    @Override
    public void run() {
        this.bank.getMoney(sum);
    }
}
