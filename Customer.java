/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.ArrayList;

public class Customer
{
    protected String name;
    protected Address address;
    protected String phoneNumber;
    protected ArrayList<Account> accounts;

    public Customer()
    {
        this("Joe Generic", new Address(), "(555) 555-5555", new CheckingAccount());
    }

    public Customer(String name, Address address, String phoneNumber, Account account)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>();
        this.accounts.add(account);
    }

    public Customer(String name, Address address, String phoneNumber, ArrayList<Account> accounts)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>(accounts);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Account> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts)
    {
        this.accounts = accounts;
    }
}
