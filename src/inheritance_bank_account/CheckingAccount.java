package inheritance_bank_account;

public class CheckingAccount extends Account {

    public CheckingAccount(int amount, int payAmount, int transferAmount, int addMoneyAmount, String accountName) {
        super(amount, payAmount, transferAmount, addMoneyAmount, accountName);
    }

    @Override
    public void pay() {
        int payRemainder = getAmount() - getPayAmount();
        if (payRemainder >= 0) {
            System.out.println("Оплата прошла успешно! Ваш остаток: " + payRemainder);
        } else {
            System.out.println("Оплата не прошла! Недостаточно средств на счету!");
        }
    }

    @Override
    public void transfer() {
        int transferRemainder = getAmount() - getTransferAmount();
        if (transferRemainder >= 0 && (getAccountName().equals("Сберегательный счет") || getAccountName().equals("Кредитный счет"))) {
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
