package multithreadingHW.bank;

public class Account {
    private long accountID;
    private double moneyAmount;
    private User user;

    public Account(User user, double moneyAmount) {
        this.user = user;
        this.accountID =  (long) (Math.random() * 2 * Long.MAX_VALUE - Long.MAX_VALUE);
        this.moneyAmount = moneyAmount;
    }

    public long getAccountID() {
        return accountID;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void showEmail(){
        System.out.println(user.getEmail());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", moneyAmount=" + moneyAmount +
                ", user=" + user +
                '}';
    }
}
