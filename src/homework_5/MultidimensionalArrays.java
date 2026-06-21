package homework_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrays {
     static void main(){
         useTwoDimensionalArray();
         System.out.println("-".repeat(50));

         useChessBoard();
         System.out.println("-".repeat(50));

         createAnArray();
         System.out.println("-".repeat(50));


     }
     public static void useTwoDimensionalArray(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите число строк: ");
         int rows = scanner.nextInt();
         System.out.print("Введите число столбцов: ");
         int cols = scanner.nextInt();

         Random input = new Random();
         int[][] array = new int[rows][cols];

         for (int i = 0; i < rows; i++) {
             for (int b = 0; b < cols; b++) {
                 array[i][b] = input.nextInt(50);
             }
         }
         System.out.println(Arrays.deepToString(array));
         System.out.println("-".repeat(50));
         System.out.println("Введите число, которое вы хотите прибавить к каждому значению: ");

         int num = scanner.nextInt();
         int sum = 0;

         for (int i = 0; i < rows; i++){
             for (int b = 0; b < cols; b++){
                 array[i][b] += num;
                 sum += array[i][b];
             }
         }
         System.out.println(Arrays.deepToString(array));
         System.out.println("Сумма всех элементов: " + sum);


     }
     public static void useChessBoard(){
         String[][] array = new String[8][8];
         for (int i = 0; i < 8; i++){
             for (int d = 0; d < 8; d++){
                 if ((i % 2 == 0 && d % 2 == 0) ||(i % 2 == 1 && d % 2 == 1)) {
                     array[i][d] = "W";
                 } else {
                     array[i][d] = "B";
                 }
             }
         }
         for (String[] row: array){
             for (String value : row){
                 System.out.print(value + " ");
             }
             System.out.println();
         }
     }


     public static void createAnArray(){
        System.out.print("Введите число строк: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Введите число столбцов: ");
        int m = new Scanner(System.in).nextInt();

         int[][] a = new int[n][m];
         int num = 0;

         for (int i = 0; i < n; i++) {
             int j;

             if (i % 2 == 0) {
                 for (j = 0; j < m; j++) {
                     a[i][j] = num++;
                 }
             }
             else {
                 for (j = m - 1; j >= 0; j--) {
                     a[i][j] = num++;
                 }
             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 System.out.printf("%3d", a[i][j]);
             }
             System.out.println();
         }
     }
}

