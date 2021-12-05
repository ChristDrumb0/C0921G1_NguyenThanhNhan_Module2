package nhap.case08.util;

import nhap.case08.model.BankAccount;

import java.util.Comparator;

public class SortById implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.getAccountId() > o2.getAccountId()) {
            return 1;
        } else if (o1.getAccountId() == o2.getAccountId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
