package model;

import java.util.ArrayList;
import java.util.List;

public class Customer{

    private String name;
    private List<AccountADT> myAccounts;

    public Customer(String name){
        setName(name);
        myAccounts = new ArrayList<>(3);
    }

    public AccountADT withdraw(AccountADT account, double amount){
        account.withdraw(amount);
        return account;
    }

    public AccountADT deposit(AccountADT account, double amount){
        account.deposit(amount);
        return account;
    }

    public AccountADT transfer(AccountADT source, AccountADT target, double amount){
        return null;
    }

    public void openAccount(AccountADT account){
        myAccounts.add(account);
    }

    public AccountADT getAccount(int accountID) {
        AccountADT account = null;

        return account;
    }

    public double viewBalance(AccountADT account){
        return account.getBalance();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
