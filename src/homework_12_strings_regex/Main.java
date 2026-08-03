package homework_12_strings_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        getAbbreviationFinder();

    }
    public static void getAbbreviationFinder(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();
        String regex = "\\p{Lu}{2,7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        while (matcher.find()){
            System.out.println(matcher.group());
            found = true;
        }
        if (!found){
            System.out.println("Аббревиатур не найдено. ");
        }

    }
}
