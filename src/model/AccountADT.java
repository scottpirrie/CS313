package model;

public interface AccountADT {
    double withdraw(double amount);
    double deposit(double amount);
    double transfer(AccountADT source, AccountADT target,double amount);
}
