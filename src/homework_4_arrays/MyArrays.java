package homework_4_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArrays {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        generateRandomIntArray();
        System.out.println("-".repeat(50));

        useMaxMin();
        System.out.println("-".repeat(50));

        sumIndexNumbers();
        System.out.println("-".repeat(50));

        useZeroElements();
        System.out.println("-".repeat(50));

        arraySwap();
        System.out.println("-".repeat(50));

        isIncreasingSequence();
        scanner.close();
    }
    public static void generateRandomIntArray() {
        int size = 5;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.print("Прямой порядок: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Обратный порядок: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void useMaxMin() {
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static void sumIndexNumbers() {
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Введите значения массива: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int min = a[0], max = a[0];
        int imin = 0, imax = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
        }
        System.out.println("Минимальный элемент: " + min + " с индексом " + imin);
        System.out.println("Максимальный элемент: " + max + " с индексом " + imax);
    }

    public static void useZeroElements() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Выберите способ заполнения: 1 - случайными числами, 2 - вручную");
        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 10);
            }
        } else if (choice == 2) {
            System.out.println("Введите " + size + " целых чисел:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Неверный выбор. Используем случайные числа.");
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 10);
            }
        }
        int zeroCount = 0;
        for (int num : array) {
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 0) {
            System.out.println("Нулевых элементов нет.");
        } else {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        }
    }

    public static void arraySwap() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Заполните массив (введите " + size + " чисел):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("Массив после разворота: " + Arrays.toString(array));
    }

    public static void isIncreasingSequence() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Заполните массив (введите " + size + " чисел):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}




























