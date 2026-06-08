package homework_3;

import java.util.Scanner;
import java.util.SplittableRandom;

public class MyFlowOperators {
    public static void main(String[] args) {

        EvenNumberOrNot();
        TemperatureChecker();
        SquaresOfNumbers();
        Consistently();
        SumNumbers();
    }

    public static void EvenNumberOrNot() {
        int number = 12;
        if (number % 2 == 0) {
            System.out.println(number + " это четное число.");
        } else {
            System.out.println(number + " это не четное число.");
        }

    }

    public static void TemperatureChecker() {
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
        scanner.close();

    }

    public static void SquaresOfNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void Consistently() {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }



    }


    public static void SumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int number = scanner.nextInt();
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до" + number + "равна:" + sum);
        } else if (number == 0) {
            System.out.println("Сумма чисел от 1 до 0 равна: 0");
        } else {
            System.out.println("Пожалуйста,введите положительно целое число.");
        }

    }

}

















