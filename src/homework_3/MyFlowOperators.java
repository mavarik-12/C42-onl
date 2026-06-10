package homework_3;

import java.util.Scanner;
import java.util.SplittableRandom;

public class MyFlowOperators {
    public static void main(String[] args) {

        displayMessage();
        temperatureChecker();
        squaresOfNumbers();
        consistently();
        sumNumberss();
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

        if (t > 5) {
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

    public static void consistently() {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }



    }


    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("\r\n Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(" Сумма чисел от 1 по " + number + " равна:" + sum);
        } else if (number == 0) {
            System.out.println(" Сумма чисел от 1 по 0 равна: 0");
        } else {
            System.out.println(" Пожалуйста,введите положительно целое число.");
        }

    }

}

















