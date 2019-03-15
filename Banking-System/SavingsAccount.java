/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

public class SavingsAccount extends Account
{
    private double interestRate;

    public SavingsAccount()
    {
        this(1);
    }

    public SavingsAccount(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public SavingsAccount(int accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    // computes interest paid
    public double getInterest()
    {
        return getInterestRate() / 100 * super.balance;
    }

    // converts field details to an easily read string
    // [called from PersonalCustomer/CommercialCustomer toString()]
    @Override
    public String toString()
    {
        return String.format("\n\tSavings Account:" +
                "\n\t\t%-17s #%1d" +
                "\n\t\t%-17s $%3.2f" +
                "\n\t\t%-17s %1s" +
                "\n\t\t%-17s %3.2f%%" +
                "\n\t\t%-17s $%3.2f\n",
                "Account number:", accountNumber,
                "Balance:", balance,
                "Date opened:", dateOpened,
                "Interest rate:", interestRate,
                "Interest accrued:", getInterest());
    }
}
