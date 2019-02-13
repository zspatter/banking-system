# Banking-System
Consider the following problem specification:

A bank system needs to store information about bank `Accounts` and `Customers`. The bank supports two different types of accounts (`Checking` and `Savings`). All bank accounts have `account Number`, `balance`, and `date opened`. Two Operations are defined for all accounts, `makeDeposit()` and `makeWithdrawal()`. `Checking accounts` have additional attribute for `check style` and `minimum balance`. `Saving accounts` have additional attribute for `interest rate` and an operation for `calculateInterest()`. All customers have a `name`, an `address`, and a `phone number`. In addition, a customer can have as many accounts as he needs.

The following is a class diagram for the Bank system described above:

![alt text](https://github.com/zspatter/Banking-System/blob/master/class_diagram_bank_system.jpg)

The above specifications have been expanded with new requirements as follows: 

There are two special types of customers (Personal and Commercial). Commercial customers have additional attributes for credit rating, contact person, and contact person phone. Personal customers have attributes for home phone and work phone. Moreover, expand the model to show that the bank has multiple branches, and each account is serviced by one branch. Naturally, each branch has many accounts.

## The Task:
1. Create a new Class Diagram for the complete system.
2. Implement all classes in your diagram using the Java programming language. Implement the
relationships as shown in your diagram.
3. Create a simple test program (no need for using GUI or Exception Handling, just make it very
simple). The name of this test program is Bank.java, it should make use of the above classes.
Bank.java should declare an ArrayList to hold all bank accounts. The test program should utilize
the system capabilities; The following are sample operations that demonstrate the systems
capabilities:
   - Create a Checking account for a commercial customer in Kokomo’s branch and add it to
the array list
    - Create a separate method to display the customer information and account balance. Call
the method on behalf of the customer you created in the previous step.
    - Deposit a $100 into the account you created in ‘a’, and then display the new info.
    - Create a Savings account for an individual customer in some branch with initial balance
of $100 and interest rate of 10% and add it to the array list.
    - Display the savings account information
    - Make a $100 deposit to the savings account, calculate the interest, then display the
information
    - Implement other operations of your choice!
4. (BONUS: 1 points) In your second test code, declare an ArrayList of Customers, where each
customer will have multiple accounts(one saving and one checking account) in the bank
application.
    - Insert 8 different customers in the Customers ArrayList.
    - Deposit an arbitrary balance for each customer’s checking account.
    - Transfer half of the checking balance to saving account of each customer.
    - Print out the bank statement of each customer.

## linebreak

I have implemented the assignment in full. I have also completed the bonus portion of the assignment. I have commented the implementation for tasks 1-3 out in the main method as I used the same class for task 4 (bonus).

The `creditRating` within the `CommercialCustomer` was assumed to be a credit score rather than a credit line. Furthermore, the `phoneNumber` within the `Account` class was assumed to represent a P`ersonalCustomer` `homePhone` or a `CommercialCustomer` `mainline`

Bonus:
The account numbers for the customers are sequential (1-8 for checking, and 10001-10008 for savings).
