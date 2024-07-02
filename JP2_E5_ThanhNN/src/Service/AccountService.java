package Service;

import Entity.Account;

public class AccountService {
    private Account account;
    private double amount;

    public AccountService(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public Account withdraw(){
        account.setBalance(account.getBalance()-this.amount);
        return account;
    }
    public Account deposit(){
        account.setBalance(account.getBalance()+this.amount);
        return account;
    }
    
    public String toString(String separate) {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.account.getId())
                .append(separate)
                .append(this.account.getBalance())
                .toString();
    }
}
