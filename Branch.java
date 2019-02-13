/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.ArrayList;

public class Branch
{
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch()
    {
        this.branchName = "Generic Bank";
        customers = new ArrayList<>();
    }

    public Branch(String branchName)
    {
        this.branchName = branchName;
        customers = new ArrayList<>();

    }

    public Branch(String branchName, ArrayList<Customer> customers)
    {
        this.branchName = branchName;
        this.customers = customers;
    }

    public String getBranchName()
    {
        return branchName;
    }

    public void setBranchName(String branchName)
    {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getAccounts()
    {
        return customers;
    }

    public void setAccounts(ArrayList<Customer> accounts)
    {
        this.customers = accounts;
    }
}
