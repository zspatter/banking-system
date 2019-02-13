# Banking-System
Consider the following problem specification:

A bank system needs to store information about bank `Accounts` and `Customers`. The bank supports two different types of accounts (`Checking` and `Savings`). All bank accounts have `account Number`, `balance`, and `date opened`. Two Operations are defined for all accounts, `makeDeposit()` and `makeWithdrawal()`. `Checking accounts` have additional attribute for `check style` and `minimum balance`. `Saving accounts` have additional attribute for `interest rate` and an operation for `calculateInterest()`. All customers have a `name`, an `address`, and a `phone number`. In addition, a customer can have as many accounts as he needs.

The following is a class diagram for the Bank system described above:





I have implemented the assignment in full. I have also completed the bonus portion of the assignment. I have commented the implementation for tasks 1-3 out in the main method as I used the same class for task 4 (bonus).

The `creditRating` within the `CommercialCustomer` was assumed to be a credit score rather than a credit line. Furthermore, the `phoneNumber` within the `Account` class was assumed to represent a P`ersonalCustomer` `homePhone` or a `CommercialCustomer` `mainline`

Bonus:
The account numbers for the customers are sequential (1-8 for checking, and 10001-10008 for savings).
