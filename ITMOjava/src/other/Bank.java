/**
package lesson26;

public class Bank {

    public static void transfer(Account src, Account dst, int money) {  // должен быть не статическим
        Accaunt obj1;
        Accaunt obj2;
        // всегда блокировать с первым меньшим id
        if (src.getId() < dst.getId()) {
            obj1 = src
            obj2 = dst;
        } else {
            obj1 = dst
            obj2 = src;
        }
    }

    synchronized (src)

    { // установить порядок синхрнизации
        synchronized (dst) {
            // перевод money
            // если есть деньги и если это не один и тот же акканут // у аккаунтов есть id
        }
    });
}
    public static void main(String[] args) {
        transfer(1, 2, 500);
        transfer(2, 1, 700);
    }
}
*/
