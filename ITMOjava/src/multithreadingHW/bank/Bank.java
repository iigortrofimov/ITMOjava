package multithreadingHW.bank;


public class Bank {

    public static void transfer(Account src, Account dst, double moneyAmount) {
        Account obj1;
        Account obj2;
        if (src.getAccountID() < dst.getAccountID()) {
            obj1 = src;
            obj2 = dst;
        } else {
            obj2 = src;
            obj1 = dst;
        }

        synchronized (obj1) {
            synchronized (obj2) {
                double srcMoney = src.getMoneyAmount();
                double dstMoney = dst.getMoneyAmount();
                if (srcMoney - moneyAmount < 0) {
                    System.out.println("Недостаточно средств!  \n На вашем счету: " + src.getMoneyAmount());
                    return;
                } else {
                    srcMoney -= moneyAmount;
                    dstMoney += moneyAmount;
                    src.setMoneyAmount(srcMoney);
                    dst.setMoneyAmount(dstMoney);
                    System.out.println("Перевод осуществлен!\nДенежных средств на счету отправителя: "
                            + src.getMoneyAmount() + "\nemail отправителя: ");
                    src.showEmail();
                    System.out.println("Денежных средств на счету получателя: " + dst.getMoneyAmount() + "\nemail " +
                            "получателя: ");
                    dst.showEmail();
                }
            }
        }
    }

    public static void main(String[] args) {
        User petrov = new User("petrov@mail.ru");
        User ivanov = new User("ivanov@mail.ru");
        User kozlov = new User("kozlov@mail.ru");
        User popov = new User("popov@mail.ru");
        Account petrovAc = new Account(petrov, 10_000);
        Account ivanovAc = new Account(ivanov, 15_500);
        Account kozlovAc = new Account(kozlov, 5_000);
        Account popovAc = new Account(popov, 7_000);
        Thread transaction = new Thread(new Transaction(petrovAc, ivanovAc, 1_000));
        Thread transaction2 = new Thread(new Transaction(petrovAc, kozlovAc, 1_000));
        Thread transaction3 = new Thread(new Transaction(popovAc, petrovAc, 1_000));
        Thread dummyTransaction = new Thread(new Transaction(ivanovAc, popovAc, 100_000));
        transaction.start();
        transaction2.start();
        transaction3.start();
        dummyTransaction.start();
    }
}
