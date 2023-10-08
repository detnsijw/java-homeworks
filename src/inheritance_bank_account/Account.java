package inheritance_bank_account;

public abstract class Account {
    private int amount;
    private int payAmount;
    private int transferAmount;
    private int addMoneyAmount;
    private String accountName;

    public Account(int amount, int payAmount, int transferAmount, int addMoneyAmount, String accountName) {
        this.amount = amount;
        this.payAmount = payAmount;
        this.transferAmount = transferAmount;
        this.addMoneyAmount = addMoneyAmount;
        this.accountName = accountName;
    }

    public abstract void pay();
    public abstract void transfer();
    public abstract void addMoney();

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public int getAddMoneyAmount() {
        return addMoneyAmount;
    }

    public void setAddMoneyAmount(int addMoneyAmount) {
        this.addMoneyAmount = addMoneyAmount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
