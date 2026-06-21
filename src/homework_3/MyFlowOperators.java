package homework_3;


import java.util.Scanner;


public class MyFlowOperators {
    public static void main(String[] args) {

        displayMessage();
        temperatureChecker();
        squaresOfNumbers();
        getSequenceOfNumbers();
        sumNumbers();
    }

    public static void displayMessage() {
        int number = 12;
        if (number % 2 == 0) {
            System.out.println(number + " это четное число.");
        } else {
            System.out.println(number + " это не четное число.");
        }

    }

    public static void temperatureChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру t:");
        double t = scanner.nextDouble();

        if (t > - 5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }


    }

    public static void squaresOfNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void getSequenceOfNumbers() {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
    }



   public static void sumNumbers(){
        int number;
        do {
            System.out.print(" \r Пожалуйста, укажите максимальное значение от 1 до максимального числа: ");
        }while ((number = new Scanner(System.in).nextInt()) < 1);
        int sum = 0;
            for (int counter = 1; counter <= number; counter ++){
                sum +=counter;
            }
            System.out.println("Cумма значений от 1 до " + number + " равно: " + sum);
        }
    }
























