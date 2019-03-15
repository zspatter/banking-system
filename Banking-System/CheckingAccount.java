/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

public class CheckingAccount extends Account
{
    private String checkStyle;
    private double minimumBalance;

    public CheckingAccount()
    {
        super(0, 5);
        this.checkStyle = "Default";
        this.minimumBalance = 5;
    }

    public CheckingAccount(String checkStyle, double minimumBalance)
    {
        super(0, 5);
        this.checkStyle = checkStyle;

        // if balance is less than minimum balance, balance is set to minimumBalance
        if (super.getBalance() < minimumBalance)
        {
            super.setBalance(minimumBalance);
            System.out.printf("Error: The passed balance was less than the minimum balance. The balance was assigned with the minimum balance value." +
                    "\nCurrent balance is: $%3.2f\n\n", super.getBalance());
        } else
        {
            this.minimumBalance = minimumBalance;
        }
    }

    public CheckingAccount(int accountNumber, double balance, String checkStyle, double minimumBalance)
    {
        super(accountNumber, balance);
        this.checkStyle = checkStyle;

        // if balance is less than minimum balance, balance is set to minimumBalance
        if (super.getBalance() < minimumBalance)
        {
            super.setBalance(minimumBalance);
            System.out.printf("Error: The passed balance was less than the minimum balance. The balance was assigned with the minimum balance value." +
                    "\nCurrent balance is: $%3.2f\n\n", super.getBalance());
        } else
        {
            this.minimumBalance = minimumBalance;
        }
    }

    public String getCheckStyle()
    {
        return checkStyle;
    }

    public void setCheckStyle(String checkStyle)
    {
        this.checkStyle = checkStyle;
    }

    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance)
    {
        if (super.balance < minimumBalance)
            System.out.println("The current balance is less than the passed minimum balance. Could not update the minimum balance." +
                    "\nCurrent minimum balance: $" + getMinimumBalance());
        else
            this.minimumBalance = minimumBalance;
    }

    // attempts to withdraw if positive value
    // if withdraw amount is less than balance, error message printed
    // if withdraw amount would result in overdraft,
    // the transaction is altered to withdraw everything but the minimum balance
    // otherwise, withdraws from account and prints account balance
    @Override
    public void makeWithdrawal(double withdraw)
    {
        if (withdraw < 0)
            System.out.println("Error: The withdrawal amount must be a positive value. Cannot complete transaction.\n");
        else if (withdraw > this.balance)
            System.out.println("Error: The withdrawal amount is greater than the account balance. Cannot complete transaction.\n");
        else if (this.getBalance() - withdraw < this.getMinimumBalance())
        {
            double maximumWithdrawalAmount = this.getBalance() - this.getMinimumBalance();
            this.balance -= maximumWithdrawalAmount;
            System.out.printf("Error: This withdrawal amount would result in an overdraft." +
                    "\n\tThe maximum withdrawal amount was withdrawn instead of the requested amount." +
                    "\n\t$%3.2f has been withdrawn instead of the requested amount of $%3.2f." +
                    "\n\tCurrent balance is: $%3.2f\n\n", maximumWithdrawalAmount, withdraw, getBalance());
        } else
        {
            this.balance -= withdraw;
            System.out.printf("$%3.2f has been withdrawn.\tCurrent balance: $%3.2f\n\n", withdraw, this.balance);
        }
    }

    // converts field details to an easily read string
    // [called from PersonalCustomer/CommercialCustomer toString()]
    @Override
    public String toString()
    {
        return String.format("\n\tChecking Account:" +
                "\n\t\t%-17s #%1d" +
                "\n\t\t%-17s $%3.2f" +
                "\n\t\t%-17s %1s" +
                "\n\t\t%-17s %1s\n",
                "Account number:", accountNumber,
                "Balance:", balance,
                "Date opened:", dateOpened,
                "Check style:", checkStyle);
    }
}
