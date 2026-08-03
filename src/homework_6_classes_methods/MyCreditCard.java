package homework_6_classes_methods;
public class MyCreditCard {
    private String accountNumber;
    private double balance;
    public MyCreditCard(String accountNumber, long initialBalance) {
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
    }
    public void addMoney(long amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет" + accountNumber + " зачислено:" + amount);
        } else {
            System.out.println("Ошибка: сумма должна быть положительной: ");

        }
    }
    public void withdrawMoney(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("С счет " + accountNumber + " снято :" + amount);
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств на счете: ");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной:");
        }
    }
    public void cardInformation() {
        System.out.println("Счет: " + accountNumber + " Баланс : " + balance);

    }

}
