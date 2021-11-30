package case_study.services.Impl;

import case_study.models.PCustomer;

import java.util.Comparator;

public class SortCustomerById implements Comparator<PCustomer> {
    @Override
    public int compare(PCustomer o1, PCustomer o2) {
        return o1.getCustomerId().compareTo(o2.getCustomerId());
    }
}
