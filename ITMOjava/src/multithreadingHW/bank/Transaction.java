package multithreadingHW.bank;

public class Transaction implements Runnable {
    private Account src;
    private Account dst;
    private double moneyAmount;

    public Transaction(Account src, Account dst, double moneyAmount) {
        this.src = src;
        this.dst = dst;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void run() {
        Bank.transfer(src, dst, moneyAmount);
    }
}
