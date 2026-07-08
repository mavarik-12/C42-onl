package GuessTheWord;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] words = {
                "программирование", "машина", "мотоцикл", "дом", "работа",
                "семья", "друзья", "теплоход", "велосипед", "фотоаппарат",
                "компьютер", "деньги", "богатство", "инвестиции", "биткойн",
                "самокат", "квартира", "леса", "грибы", "животные"
        };

        boolean playAgain = true;

        while (playAgain) {

            String secretWord = words[random.nextInt(words.length)];
            char[] currentDisplay = new char[secretWord.length()];


            Arrays.fill(currentDisplay, '_');

            int attempts = 5; //
            boolean gameWon = false;

            System.out.println("\n=== НОВАЯ ИГРА: УГАДАЙ СЛОВО ===");
            System.out.println("У вас есть " + attempts + " попыток.");
            printCurrentState(currentDisplay);

            while (attempts > 0 && !gameWon) {
                System.out.print("Введите букву или слово целиком: ");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    System.out.println("Пожалуйста, введите что-нибудь.");
                    continue;
                }


                if (input.length() > 1) {
                    if (input.equals(secretWord)) {
                        gameWon = true;
                        break;
                    } else {
                        System.out.println("Неверно! Это не то слово.");
                        attempts--;
                    }
                }

                else {
                    char guessChar = input.charAt(0);
                    boolean found = false;

                    for (int i = 0; i < secretWord.length(); i++) {
                        if (secretWord.charAt(i) == guessChar) {
                            currentDisplay[i] = guessChar;
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Такой буквы нет в слове!");
                        attempts--;
                    } else {
                        System.out.println("Буква найдена!");
                    }
                }

                System.out.println("Осталось попыток: " + attempts);
                printCurrentState(currentDisplay);


                if (!new String(currentDisplay).contains("_")) {
                    gameWon = true;
                }
            }


            if (gameWon) {
                System.out.println("\n ПОЗДРАВЛЯЮ! Вы угадали слово: " + secretWord);
            } else {
                System.out.println("\nCreating a guess the word game ПОРАЖЕНИЕ. Загаданное слово было: " + secretWord);
            }


            System.out.print("\nХотите начать заново? (Да/Нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (!answer.equals("да") && !answer.equals("д")) {
                playAgain = false;
                System.out.println("Прощайте, до свидания");
            }
        }

        scanner.close();
    }


    private static void printCurrentState(char[] display) {
        StringBuilder sb = new StringBuilder();
        for (char c : display) {
            sb.append(c).append(" ");
        }
        System.out.println("Слово: " + sb.toString());
    }
}