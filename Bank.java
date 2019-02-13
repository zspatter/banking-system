/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.ArrayList;
import java.util.Random;

public class Bank
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        /**
         * Task 1-3
         */
//        Branch branch = new Branch("Kokomo Branch");
//        // creates a checking account for a commercial customer
//        CommercialCustomer commercialCustomer = new CommercialCustomer("Aptiv",
//                new Address(2151,
//                        "E. Lincoln Rd.",
//                        "Kokomo",
//                        "IN",
//                        "US",
//                        46901),
//                "(765) 451-5011",
//                new CheckingAccount(12345,
//                        125,
//                        "Automotive Theme",
//                        50000),
//                750,
//                "Stacy Burnette",
//                "(765) 451-0786");
//
//        // adds checking account to ArrayList in branch
//        branch.getAccounts().add(commercialCustomer);
//        // displays account and customer information
//        System.out.println(commercialCustomer.toString());
//        // deposits 100 to the checking account
//        commercialCustomer.getAccounts().get(0).makeDeposit(100);
//        System.out.println("=======================================================\n");
//
//        // creates a savings account for a personal customer
//        PersonalCustomer personalCustomer = new PersonalCustomer("Joe Generic",
//                new Address(),
//                "(765) 628-6045",
//                new SavingsAccount(54321,
//                        100,
//                        10),
//                "(765) 210-1779");
//
//        // adds savings account to the ArrayList in branch
//        branch.getAccounts().add(personalCustomer);
//        // displays account and customer information
//        System.out.println(personalCustomer.toString());
//        // deposits 100 to the savings account
//        personalCustomer.getAccounts().get(0).makeDeposit(100);
//        // displays interest accrued
//        SavingsAccount savingsAccount = (SavingsAccount) personalCustomer.getAccounts().get(0);
//        System.out.printf("Interest accrued: $%3.2f\n\n", savingsAccount.getInterest());

        /**
         * Task 4
         */
        // creates 8 customers each with a checking and savings account
        // these accounts each transfer half of their checking balance
        // to savings (or the highest possible amount that doesn't cause an overdraft)
        ArrayList<Customer> customers = createNCustomers(8);

        // line break to separate the deposit/withdrawal messages from customer/account details
        System.out.println("=======================================================\n");
        printCustomers(customers);
    }


    // creates and returns an ArrayList with 1 checking and 1 savings account
    private static ArrayList<Account> createAccounts(int x)
    {
        ArrayList<Account> accounts = new ArrayList<>();

        CheckingAccount checkingAccount = new CheckingAccount(x,
                random.nextInt(15001),
                "Default",
                random.nextInt(1501));
        SavingsAccount savingsAccount = new SavingsAccount(x + 10000,
                random.nextInt(50001),
                random.nextDouble() + random.nextInt(10));
        accounts.add(checkingAccount);
        accounts.add(savingsAccount);
        return accounts;
    }

    // this loop creates N customers each with a checking and savings account
    // these customers each transfer half of the balance of their
    // checking account to their savings account
    private static ArrayList<Customer> createNCustomers(int n)
    {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Account> accounts;
        Customer customer;

        for (int i = 1; i < n + 1; i++)
        {
            // returns ArrayList with 1 checking and 1 savings account
            accounts = createAccounts(i);

            // if true, the customer will be a personal customer
            if (random.nextBoolean())
                customer = new PersonalCustomer("Joe Generic",
                        new Address(),
                        "(555) 555-5555",
                        accounts,
                        "(765) 432-1012");
            // else, the customer will be a commercial customer
            else
                customer = new CommercialCustomer("Generic Co.",
                        new Address(),
                        "(800) 555-5555",
                        accounts,
                        700,
                        "Joe Generic",
                        "(765) 432-1012");


            // transferBalance value is half the checking balance
            // transferBalance is withdrawn from checking and deposited to savings
            transferBalances(customer);

            // customer added to ArrayList of Customers
            customers.add(customer);
        }
        return customers;
    }

    // transfers half the checking balance to savings
    private static void transferBalances(Customer customer)
    {
        // transferBalance value is half the checking balance
        // transferBalance is withdrawn from checking and deposited to savings
        double transferBalance = customer.getAccounts().get(0).getBalance() / 2;
        double maximumWithdrawalAmount = 0;
        boolean overdraft = false;

        // if withdrawal will result in overdraft, maximumWithdrawAmount is set
        // and overdraft flag is set to true
        // this is to ensure the deposit function matches the value of the withdrawal function
        if (customer.getAccounts().get(0).getBalance() - transferBalance <
                ((CheckingAccount)customer.getAccounts().get(0)).getMinimumBalance())
        {
            maximumWithdrawalAmount = customer.getAccounts().get(0).getBalance() -
                    ((CheckingAccount)customer.getAccounts().get(0)).getMinimumBalance();
            overdraft = true;
        }

        // request withdrawal of half the balance of checking account
        // overdraft limits are implemented in the makeWithdrawal function directly
        customer.getAccounts().get(0).makeWithdrawal(transferBalance);

        // if requested withdrawal amount is too high,
        // transferBalance is replaced with maximumWithdrawalAmount
        // this ensures the deposit and withdraw amounts match
        if (overdraft)
            customer.getAccounts().get(1).makeDeposit(maximumWithdrawalAmount);
        // otherwise, requested transferBalance is used for deposit
        else
            customer.getAccounts().get(1).makeDeposit(transferBalance);
    }

    // prints details of each customer including all types of accounts
    private static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer element : customers)
        {
            System.out.println(element.toString());
            System.out.println("=======================================================\n");
        }
    }
}
