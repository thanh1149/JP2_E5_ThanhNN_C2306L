import Entity.Account;
import Service.DepositThread;
import Service.WithdrawThread;

import java.io.IOError;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("A123", 100);
        double withdrawAmount = 10;
        double depositAmount = 5;

        WithdrawThread wd = new WithdrawThread(acc,withdrawAmount);
        DepositThread dp = new DepositThread(acc,depositAmount);

        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final amount: " + acc.toString());

    }
}