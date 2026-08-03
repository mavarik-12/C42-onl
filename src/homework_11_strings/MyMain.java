package homework_11_strings;



import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        getStringLength();
        getStringSorter();
        getStringLengthFilter();
        getFindUniqueWord();
        getDuplicateCharacters();
    }
         public static void getStringLength() {
             System.out.println(" --- Самая короткая и длинная строка --- ");

            System.out.println("Введите первую строку:");
            String str1 = scanner.nextLine();

            System.out.println("Введите вторую строку:");
            String str2 = scanner.nextLine();

            System.out.println("Введите третью строку:");
            String str3 = scanner.nextLine();
            int minLength = Math.min(str1.length(), Math.min(str2.length(), str3.length()));
            int maxLength = Math.max(str1.length(), Math.max(str2.length(), str3.length()));

            String shortestString = "";
            if (str1.length() == minLength) {
                shortestString = str1;
            } else if (str2.length() == minLength) {
                shortestString = str2;
            } else {
                shortestString = str3;
            }

            String longestString = "";
            if (str1.length() == maxLength) {
            } else if (str2.length() == maxLength) {
                longestString = str2;
            } else {
                longestString = str3;
            }
            System.out.println("Самая короткая строка: \"" + shortestString + "\" (длина: " + minLength + ")");
            System.out.println("Самая длинная строка: \"" + longestString + "\"(длина: " + maxLength + ")");
        }
        public static void getStringSorter() {
        System.out.println(" --- Сортировка строк по длине --- ");
        String[] strings = new String[3];
        System.out.println("Введите 3 строки:");

        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {

                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        System.out.println("\nОтсортированные строки ( по длине):");
        for (String str : strings) {
            System.out.println(str);
        }
    }

        public static void getStringLengthFilter(){
        System.out.println(" --- Строки короче средней длины ----");
        String[] strings = new  String[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }
        int sumLength = 0;
        for (String str :strings){
            sumLength += str.length();
        }
        float averageLength = (float) sumLength / strings.length;
        System.out.println("Средняя длина строки: " + averageLength);
        System.out.println("Строки длина которых меньше средней:");
        boolean found = false;
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + "(длина: " + str.length() + ")");
                found = true;
            }
        }
        if (!found){
            System.out.println("Таких строк нет.");
        }
    }

    public static void getFindUniqueWord(){
        System.out.println(" --- первое слово с уникальными символами --- ");
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Введите строку " + (i + 1) + ":");
            lines[i] = scanner.nextLine();
        }
        String result = findFirstWordWithUniqueChars(lines);
        if (result != null) {
            System.out.println("Найдено слово: " + result);
        } else {
            System.out.println("Такого слова нет.");
        }
    }
    private static String findFirstWordWithUniqueChars(String[]lines){
        for (String line : lines){
            String[] words = line.split("\\s+");
            for (String word : words){
                String cleanWord = word.replaceAll("[^A-Za-zA-Яа-я]", "");

                if (!cleanWord.isEmpty() && hasUniqueChars(cleanWord)){
                    return cleanWord;
                }
            }
        }
        return null;
    }
    private static boolean hasUniqueChars(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++){
            if (chars[i] == chars[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void getDuplicateCharacters(){
        System.out.println(" --- Дублирование символов --- ");
        System.out.println("Введите строчку для дублирования символов: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            result.append(c).append(c);
        }
        System.out.println("Результат: " + result.toString());
    }
}




