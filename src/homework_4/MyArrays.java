package homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArrays {
    static void main() {
        int[] intArray;


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


    }

    public static void generateRandomIntArray() {
        int size = 5;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        for (int value : array) {
            System.out.print(value);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }


    public static void useMaxMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumIndexNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Введите значение массива: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            a[i] = (int) (Math.random() * 100);
        }
        int min = a[0],
                max = a[0];
        int imin = 0,
                imax = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
                imin = i;

            } else if (a[i] > max) {
                max = a[i];
                imax = i;
            }

        System.out.println("Индекс минимального элемента: " + min + "  с индексом " + imin);
        System.out.println("Индекс максимального элемента: " + max + "  с индексом " + imax);
    }

    public static void useZeroElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Выберете способ заполнения: 1 - случайными числами, 2 - вручную  ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 10);
            }
        } else if (choice == 2) {
            System.out.println("Введите " + size + "  целых чисел");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Неверный выбор. Используете случайными числами.");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 100) - 50;

            System.out.println("Введите элемент массива: ");
            for ( i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Исходный массив: " + Arrays.toString(array));

            for ( i = 0; i < size / 2; i++) {
                int temp = array[i];
                array[i] = array[size - 1 - i];
                array[size - 1 - i] = temp;
            }
            System.out.println("Массив после обмена: " + Arrays.toString(array));
            break;
        }
    }

    public static void isIncreasingSequence() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//
//        System.out.println("Заполните массив: ");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент [" + i + "]: ");
//            array[i] = fillElement(scanner);
//        }
//        System.out.println("Массив: " + Arrays.toString(array));
//        if (isInceasing(array)) ;
//        System.out.println("Массив является строго возрастающей последовательностью.");
//    } else {
//        System.out.println("Массив не является строго возрастающей последовательности");
//        int min = 1;
//        int max = 50;
//        return (int) (Math.random() * (max - min + 1) + min);
//        private static boolean isIncreasing(int array){
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] <= array[i - 1]) {
//                    return false;
//                }
//            }
//            return true;
//        }
        int[] mas = new int[4];
//
    for (int i = 0; i < mas.length; i++) {
        mas[i] = (int) (Math.random() * 90) + 10;
    }
    System.out.println(Arrays.toString(mas));

    boolean flag = true;
    for (int i = 1; i < mas.length; i++) {
        if (mas[i] <= mas[i - 1]) {
            flag = false;
            break;
        }
    }
    if (flag) {
        System.out.println("Массив является строго возрастающей последовательностью");
    } else {
        System.out.println("Массив не является строго возрастающей последовательностью");
    }
}


    }




























