package inheritance_bank_account;

public class SavingAccount extends Account {

    public SavingAccount(int amount, int payAmount, int transferAmount, int addMoneyAmount, String accountName) {
        super(amount, payAmount, transferAmount, addMoneyAmount, accountName);
    }

    @Override
    public void pay() {
        System.out.println("Со сберегательного счета нельзя платить!");
    }

    @Override
    public void transfer() {
        int transferRemainder = getAmount() - getTransferAmount();
        if (transferRemainder >= 0 && (getAccountName().equals("Расчетный счет") || getAccountName().equals("Кредитный счет"))) {
            System.out.println("Перевод на ваш " + getAccountName() + " прошел успешно! Ваш остаток: " + transferRemainder);
        } else {
            System.out.println("Перевод не прошел! Недостаточно средств на счету!");
        }
    }

    @Override
    public void addMoney() {
        int addMoneyRemainder = getAmount() + getAddMoneyAmount();
        System.out.println("Сумма: " + getAddMoneyAmount() + ", поступила на ваш счет! Остаток на вашем счету: " + addMoneyRemainder);
    }
}

