package case_study.models;

public class PCustomer extends Person{
    protected String customerId = "7";
    private String[] customerType = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    private String customerAddress;

    public PCustomer() {
    }

    public PCustomer(String customerId, String[] customerType, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public PCustomer(String name, String birthDay, boolean gender, String idNumber, long phoneNumber, String email, String customerId, String[] customerType, String customerAddress) {
        super(name, birthDay, gender, idNumber, phoneNumber, email);
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
