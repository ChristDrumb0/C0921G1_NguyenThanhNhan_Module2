package nhap.case08.model;

public class PaymentAccount extends BankAccount{
//    Số thẻ, Số tiền trong tài khoản.
    String cardNum;
    String moneyAmount;

    public PaymentAccount() {

    }

    public PaymentAccount(int accountId, String accountNum, String accountName, String dateCreate, String cardNum, String moneyAmount) {
        super(accountId, accountNum, accountName, dateCreate);
        this.cardNum = cardNum;
        this.moneyAmount = moneyAmount;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + cardNum +
                "," + moneyAmount;
    }
}
