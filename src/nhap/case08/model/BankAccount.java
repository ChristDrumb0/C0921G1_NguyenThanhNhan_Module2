package nhap.case08.model;

import java.util.Objects;

public abstract class BankAccount {
//    Id tài khoản, Mã tài khoản, Tên chủ tài khoản, Ngày tạo tài khoản.
    int accountId;
    String accountNum;
    String accountName;
    String dateCreate;

    public BankAccount() {
    }

    public BankAccount(int accountId, String accountNum, String accountName, String dateCreate) {
        this.accountId = accountId;
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.dateCreate = dateCreate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountId == that.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return accountId +
                "," + accountNum +
                "," + accountName +
                "," + dateCreate ;
    }

}

