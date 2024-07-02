package Service;

import Entity.Account;

public class DepositThread implements Runnable {
    private AccountService accountService;

    public DepositThread(Account acc, double amount) {
        this.accountService = new AccountService(acc, amount);
    }

    @Override
    public void run() {
       accountService.deposit();
        System.out.println("Deposited: " + accountService.toString(" | "));
    }
}
