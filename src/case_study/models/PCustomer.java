package case_study.models;

import java.time.LocalDate;
import java.util.Arrays;

public class PCustomer extends Person{
    protected String customerId;
    private int customerType ;
    private String customerAddress;

    public PCustomer() {
    }

//    public PCustomer(String customerId, String customerType, String customerAddress) {
//        this.customerId = customerId;
//        this.customerType = customerType;
//        this.customerAddress = customerAddress;
//    }

    public PCustomer(String customerId, String name, LocalDate dayOfBirth, String gender, String personalId, String phoneNumber,
                     String email, int customerType, String customerAddress) {
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

    public int getCustomerType() {
        return customerType;
    }
// {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    public String typeToString(){
        switch (getCustomerType()){
            case 1:
                return "Member";
            case 2:
                return "Silver";
            case 3:
                return "Gold";
            case 4:
                return "Platinum";
            case 5:
                return "Diamond";
            default:
                return "please input from 1-5";
        }
    }
    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer:" +
                "customerId: '" + customerId + '\'' +
                ", name: '" + name + '\'' +
                ", dayOfBirth: " + dayOfBirth +
                ", gender: " + gender +
                ", personalId: '" + personalId + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", email: '" + email + '\'' +
                ", customerType: " + typeToString() +
                ", customerAddress: '" + customerAddress + '\'' +
                '.';
    }
}
