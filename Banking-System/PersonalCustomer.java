/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.ArrayList;

public class PersonalCustomer extends Customer
{
    private String homePhone;
    private String workPhone;


    public PersonalCustomer()
    {
        this.homePhone = this.getPhoneNumber();
        this.workPhone = "(123) 456-7890";
    }

    public PersonalCustomer(String homePhone, String workPhone)
    {
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }

    public PersonalCustomer(String name, Address address, String homePhone,
                            Account account, String workPhone)
    {
        super(name, address, homePhone, account);
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }

    public PersonalCustomer(String name, Address address, String homePhone,
                            ArrayList<Account> accounts, String workPhone)
    {
        super(name, address, homePhone, accounts);
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }

    public String getHomePhone()
    {
        return homePhone;
    }

    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }

    public String getWorkPhone()
    {
        return workPhone;
    }

    public void setWorkPhone(String workPhone)
    {
        this.workPhone = workPhone;
    }

    /**
     * converts field details to an easily read string
     * gathers (multiple) account details using StringBuilder
     * calls address.toString()
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Account account : super.getAccounts())
            sb.append(account.toString());


        return String.format("Personal Customer:" +
                        "\n\tName: %1s" +
                        "\n\t%1s" +
                        "\n\tHome phone: %1s" +
                        "\n\tWork phone: %1s\n",
                name,
                super.address.toString(),
                homePhone,
                workPhone)
                + sb.toString();
    }
}
