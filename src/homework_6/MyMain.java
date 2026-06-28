package homework_6;

public class MyMain {
    static void main(){
        createCreditCarte();


    }


    public static void createCreditCarte(){
        MyCreditCard card1 = new MyCreditCard("1234567-89101112", 2500);
        MyCreditCard card2 = new MyCreditCard("5678910-12131415", 4500);
        MyCreditCard card3 = new MyCreditCard("10111213-14151617", 7000);

        card1.addMoney(1000);
        card2.addMoney(600);
        card3.withdrawMoney(1600);

        System.out.println("\n Текущее состояние карт: ");
        card1.cardInformation();
        card2.cardInformation();
        card3.cardInformation();





    }
}
