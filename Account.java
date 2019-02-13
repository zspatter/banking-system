/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.Date;

public class Account
{
    protected int accountNumber;
    protected double balance;
    protected Date dateOpened;

    public Account()
    {
        this(0, 0);
    }

    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateOpened = new Date();
    }

    // deposits to account if positive value and prints account balance
    // otherwise, prints error message
    public void makeDeposit(double deposit)
    {
        if (deposit < 0)
            System.out.println("The deposit amount must be a positive value. Cannot complete transaction.\n");
        else
        {
            this.balance += deposit;
            System.out.printf("$%3.2f has been deposited.\tCurrent balance: $%3.2f\n\n", deposit, this.balance);
        }
    }

    // attempts to withdraw if positive value
    // if withdraw amount is less than balance, error message printed
    // otherwise, withdraws from account and prints account balance
    public void makeWithdrawal(double withdraw)
    {
        if (withdraw < 0)
            System.out.println("Error: The withdrawal amount must be a positive value. Cannot complete transaction.\n");
        else if (withdraw > this.balance)
            System.out.println("Error: The withdrawal amount is greater than the account balance. Cannot complete transaction.\n");
        else
        {
            this.balance -= withdraw;
            System.out.printf("$%3.2f has been withdrawn.\tCurrent balance: $%3.2f\n\n", withdraw, this.balance);
        }
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public Date getDateOpened()
    {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened)
    {
        this.dateOpened = dateOpened;
    }
}
