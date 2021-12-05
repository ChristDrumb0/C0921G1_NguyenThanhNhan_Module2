package nhap.case08.model;

public class SavingAccount extends BankAccount {
    //    Số tiền gửi tiết kiệm, Ngày gửi tiết kiệm, Lãi suất, Kì hạn.
    int savingAmount;
    String savingDate;
    String interest;
    String period;

    public SavingAccount() {
    }

    public SavingAccount(int accountId, String accountNum, String accountName, String dateCreate, int savingAmount, String savingDate, String interest, String period) {
        super(accountId, accountNum, accountName, dateCreate);
        this.savingAmount = savingAmount;
        this.savingDate = savingDate;
        this.interest = interest;
        this.period = period;
    }

    public double getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    public String getSavingDate() {
        return savingDate;
    }

    public void setSavingDate(String savingDate) {
        this.savingDate = savingDate;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + savingAmount +
                "," + savingDate +
                "," + interest +
                "," + period ;
    }
}
