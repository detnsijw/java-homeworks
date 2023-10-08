package inheritance_bank_account;

public class CreditAccount extends Account {

    public CreditAccount(int amount, int payAmount, int transferAmount, int addMoneyAmount, String accountName) {
        super(amount, payAmount, transferAmount, addMoneyAmount, accountName);
    }

    @Override
    public void pay() {
        int payRemainder = getAmount() - getPayAmount();
        System.out.println("Оплата в сумму: " + getPayAmount() + " прошла успешно! Ваша задолженность: " + payRemainder);
    }

    @Override
    public void transfer() {
        int transferRemainder = getAmount() - getTransferAmount();
        if (getAccountName().equals("Сберегательный счет")) {
            System.out.println("Перевод на ваш Сберегательный счет прошел успешно! Ваша задолженность: " + transferRemainder);
        } else {
            System.out.println("Перевод на ваш Расчетный счет прошел успешно! Ваша задолженность: " + transferRemainder);
        }

    }

    @Override
    public void addMoney() {
        int addMoneyRemainder = getAmount() + getAddMoneyAmount();
        System.out.println("Пополнение на сумму: " + getAddMoneyAmount() + " прошло успешно! Ваш счет составляет: " + addMoneyRemainder);
    }
}
