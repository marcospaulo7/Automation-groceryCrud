package com.automationpratic.models;

public class CadastroModel {

    protected String CustomerName;
    protected String ContactLastName;
    protected String ContactFirstName;
    protected String Phone;
    protected String AddressLine1;
    protected String AddressLine2;
    protected String City;
    protected String State;
    protected String PostalCode;
    protected String Country;
    protected String SalesRepEmployeeNumber;
    protected int CreditLimit;


    public CadastroModel(
              String CustomerName
            , String ContactLastName
            , String ContactFirstName
            , String Phone
            , String AddressLine1
            , String AddressLine2
            , String City
            , String State
            , String PostalCode
            , String Country
            , String SalesRepEmployeeNumber
            , int CreditLimit
    ) {
        setCustomerName(CustomerName);
      setContactLastName(ContactLastName);
      setContactFirstName(ContactFirstName);
      setPhone(Phone);
      setAddressLine1(AddressLine1);
      setAddressLine2(AddressLine2);
      setCity(City);
      setCountry(Country);
      setState(State);
      setPostalCode(PostalCode);
      setSalesRepEmployeeNumber(SalesRepEmployeeNumber);
      setCreditLimit(CreditLimit);
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getContactLastName() {
        return ContactLastName;
    }

    public void setContactLastName(String contactLastName) {
        ContactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return ContactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        ContactFirstName = contactFirstName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public CharSequence getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSalesRepEmployeeNumber() {
        return SalesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(String salesRepEmployeeNumber) {
        SalesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }
}
