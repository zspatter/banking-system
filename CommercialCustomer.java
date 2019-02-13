/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

import java.util.ArrayList;

public class CommercialCustomer extends Customer
{
    private int creditRating;
    private String contactPersonName;
    private String contactPersonPhone;

    public CommercialCustomer()
    {
        this.creditRating = 600;
        this.contactPersonName = super.getName();
        this.contactPersonPhone = super.getPhoneNumber();
    }

    public CommercialCustomer(int creditRating, String contactPersonName, String contactPersonPhone)
    {
        this.creditRating = creditRating;
        this.contactPersonName = contactPersonName;
        this.contactPersonPhone = contactPersonPhone;
    }

    public CommercialCustomer(String name, Address address, String phoneNumber, Account account, int creditRating, String contactPersonName, String contactPersonPhone)
    {
        super(name, address, phoneNumber, account);
        this.creditRating = creditRating;
        this.contactPersonName = contactPersonName;
        this.contactPersonPhone = contactPersonPhone;
    }

    public CommercialCustomer(String name, Address address, String phoneNumber, ArrayList<Account> accounts, int creditRating, String contactPersonName, String contactPersonPhone)
    {
        super(name, address, phoneNumber, accounts);
        this.creditRating = creditRating;
        this.contactPersonName = contactPersonName;
        this.contactPersonPhone = contactPersonPhone;
    }

    public int getCreditRating()
    {
        return creditRating;
    }

    public void setCreditRating(int creditRating)
    {
        this.creditRating = creditRating;
    }

    public String getContactPersonName()
    {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName)
    {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonPhone()
    {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone)
    {
        this.contactPersonPhone = contactPersonPhone;
    }

    // converts field details to an easily read string
    // gathers (multiple) account details using StringBuilder
    // calls address.toString()
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Account account : super.getAccounts())
            sb.append(account.toString());

        return String.format("Commercial Customer:" +
                        "\n\tName: %1s" +
                        "\n\t%1s" +
                        "\n\tMainline: %1s" +
                        "\n\tCredit: %1d" +
                        "\n\tContact: %1s, %1s",
                name, super.address.toString(),
                super.getPhoneNumber(),
                creditRating,
                contactPersonName, contactPersonPhone)
                + sb.toString();
    }
}
