/**
 * Zachary Patterson
 * Lab 3 - Inheritance and Polymorphism
 * 2019-02-18
 * INFO 211
 */

public class Address
{
    private int doorNumber;
    private String street;
    private String city;
    private String stateCode;
    private String countryCode;
    private int postalCode;

    public Address()
    {
        this(123, "Boulevard St.", "Generic Town", "State", "US", 55555);
    }

    public Address(int doorNumber, String street, String city, String stateCode, String countryCode, int postalCode)
    {
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    public int getDoorNumber()
    {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber)
    {
        this.doorNumber = doorNumber;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStateCode()
    {
        return stateCode;
    }

    public void setStateCode(String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    public int getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }

    // converts field details to an easily read string
    // (called from PersonalCustomer/CommercialCustomer toString())
    @Override
    public String toString()
    {
        return String.format("Address:" +
                "\n\t\t%1d %1s" +
                "\n\t\t%1s, %1s, %1s   %1d",
                doorNumber, street,
                city, stateCode, countryCode, postalCode);
    }
}
