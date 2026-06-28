package homework_6;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек

//текущая сумма на счету
//метод начисления суммы
//метод снимать некоторую сумму денег
//метод выводит текущую информацию о карточки
//создать три обьекта класса CreaditCard у которых заданы номера счета и начальная сумма
//проверка
//положить деньги на первые две карточки и снять с третьей
//вывести на экран текущие состояние всех трех карточек


public class MyCreditCard {
    private String accountNumber;
    private double balance;

//    public MyCreditCard(){
//
//    }


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
