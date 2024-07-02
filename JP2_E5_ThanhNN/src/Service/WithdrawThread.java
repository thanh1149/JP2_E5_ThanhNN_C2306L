package Service;

import Entity.Account;

public class WithdrawThread implements Runnable {
    private AccountService accountService;

    public WithdrawThread(Account acc, double amount) {
        this.accountService = new AccountService(acc, amount);
    }

    @Override
    public void run() {
            accountService.withdraw();
            System.out.println("Withdrawn: " + accountService.toString(" | "));
    }
}
