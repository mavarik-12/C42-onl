package LifeBinaryCalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\nВыберите способ перевода:");
            System.out.println("1 - с использованием массива: ");
            System.out.println("2 - с использованием рекурсии: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
                continue;
            }
            int choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
                continue;
            }
            System.out.println("Введите неотрицательное десятичное число:");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Нужно ввести целое число.");
                continue;
            }
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Программа работает только с неотрицательными числами. Попробуйте ещё раз.");
                continue;
            }
            boolean useArray = (choice == 1);
            String binaryResult = performConversion(number, useArray);

            System.out.println("\nИсходное число: " + number);
            System.out.println("Способ перевода: " + (useArray ? "массив: " : "рекурсия: "));
            System.out.println("Процесс перевода:");
            printProcess(number, useArray);
            System.out.println("Двоичное значение: " + binaryResult);

            if (!saveToFile(number, binaryResult, useArray)) {
                System.out.println("Ошибка при сохранении в файл.");
            }
            System.out.println("\nХотите ввести другое число?");
            System.out.println("1 - да");
            System.out.println("2 - нет");

            if (!scanner.hasNextInt()) {
                scanner.next();
                continueProgram = false;
                continue;
            }
            int continueChoice = scanner.nextInt();
            if (continueChoice != 1) {
                continueProgram = false;
            }
        }
        scanner.close();
    }
    private static String performConversion(int number, boolean useArray) {
        if (number == 0) return "0";

        if (useArray) {
            int[] remainders = new int[32];
            int index = 0;
            int temp = number;

            while (temp > 0) {
                remainders[index++] = temp % 2;
                temp /= 2;
            }

            StringBuilder binaryBuilder = new StringBuilder();
            for (int i = index - 1; i >= 0; i--) {
                binaryBuilder.append(remainders[i]);
            }
            return binaryBuilder.toString();
        } else {
            return toBinaryRecursive(number);
        }
    }
    private static String toBinaryRecursive(int n) {
        if (n == 0) return "";
        return toBinaryRecursive(n / 2) + (n % 2);
    }

    private static void printProcess(int number, boolean useArray) {
        if (number == 0) {
            System.out.println("0 / 2 = 0, остаток 0");
            return;
        }

        if (useArray) {
            int temp = number;
            while (temp > 0) {
                int remainder = temp % 2;
                System.out.println(temp + " / 2 = " + (temp / 2) + ", остаток " + remainder);
                temp /= 2;
            }
        } else {
            printRecursiveProcess(number);
        }
    }

    private static void printRecursiveProcess(int n) {
        if (n > 0) {
            printRecursiveProcess(n / 2);
            int remainder = n % 2;
            System.out.println(n + " / 2 = " + (n / 2) + ", остаток " + remainder);
        }
    }

    private static boolean saveToFile(int number, String binaryResult, boolean useArray) {
        try (FileWriter writer = new FileWriter("src/LifeBinaryCalculator/conversion_history.txt", true)) {
            writer.write("------------------------------------------\n");
            writer.write("Исходное число: " + number + "\n");
            writer.write("Способ перевода: " + (useArray ? "массив." : "рекурсия.") + "\n");
            writer.write("Двоичное значение: " + binaryResult + "\n");
            writer.write("------------------------------------------\n");
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return false;
        }
    }
}
