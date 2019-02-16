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
    private ArrayList<Account> accounts;

    public Branch()
    {
        this.branchName = "Generic Bank";
        accounts = new ArrayList<>();
    }

    public Branch(String branchName)
    {
        this.branchName = branchName;
        accounts = new ArrayList<>();
    }

    public Branch(String branchName, ArrayList<Account> accounts)
    {
        this.branchName = branchName;
        this.accounts = accounts;
    }

    public String getBranchName()
    {
        return branchName;
    }

    public void setBranchName(String branchName)
    {
        this.branchName = branchName;
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
