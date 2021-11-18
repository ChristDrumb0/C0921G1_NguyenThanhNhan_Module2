package case_study.models;

import java.time.LocalDate;

public class PCustomer extends Person{
    protected String customerId;
    private String[] customerType = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    private String customerAddress;

    public PCustomer() {
    }

    public PCustomer(String customerId, String[] customerType, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public PCustomer(String customerId, String name, LocalDate dayOfBirth, boolean gender, String personalId, String phoneNumber, String email, String[] customerType, String customerAddress) {
        super(name, dayOfBirth, gender, personalId, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String[] getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String[] customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
