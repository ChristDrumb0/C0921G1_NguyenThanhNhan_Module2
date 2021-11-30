package case_study.services;

import case_study.models.PCustomer;


public interface CustomerService extends Service{

    void displayCustomer();
    void addCustomer(PCustomer customer);
    boolean getCusID(String customerId);
    void editCustomer(PCustomer customerId);

}
