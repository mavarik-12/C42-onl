package TicTacToe;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final int SIZE = 3;
    private static final char EMPTY = '.';
    private static final char X = 'X';
    private static final char O = 'O';

    private char[][] board;
    private int currentPlayer; // 1 для X (человек), 2 для O (компьютер)

    public Game() {
        resetBoard();
        currentPlayer = 1;
    }


    private void resetBoard() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    public void humanTurn(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.print("Введите координаты (строка столбец, от 1 до 3): ");


            if (!scanner.hasNextInt()) {
                String invalidInput = scanner.nextLine();
                System.out.println("Пожалуйста, введите числа. Вы ввели: " + invalidInput);
                continue;
            }

            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (isCellValid(row, col)) {
                board[row][col] = X;
                currentPlayer = 2;
                return;
            } else {
            }
        }
    }

    public void aiTurn(Random random) {
        int row, col;
        do {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (!isCellValid(row, col));

        board[row][col] = O;
        currentPlayer = 1;
        System.out.println("Компьютер сделал ход: " + (row + 1) + " " + (col + 1));
    }

    private boolean isCellValid(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            System.out.println("Координаты вне поля! Попробуйте снова.");
            return false;
        }
        if (board[row][col] != EMPTY) {
            System.out.println("Клетка уже занята! Попробуйте другую.");
            return false;
        }
        return true;
    }

    public char checkWinner() {

        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != EMPTY &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }


        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] != EMPTY &&
                    board[0][j] == board[1][j] &&
                    board[1][j] == board[2][j]) {
                return board[0][j];
            }
        }


        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return ' ';
    }

    private boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) return false;
            }
        }
        return true;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Добро пожаловать в Крестики-Нолики!");

        while (true) {

            resetBoard();


            boolean humanStarts = random.nextBoolean();
            currentPlayer = humanStarts ? 1 : 2;

            if (!humanStarts) {
                System.out.println("Компьютер ходит первым (O).");
                aiTurn(random);
            } else {
                System.out.println("Вы ходите первым (X).");
            }

            while (true) {
                printBoard();

                char winner = checkWinner();
                if (winner != ' ') {
                    printBoard();
                    if (winner == X) System.out.println("Поздравляем! Вы победили!");
                    else System.out.println("Компьютер победил!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("Ничья!");
                    break;
                }


                if (currentPlayer == 1) {
                    humanTurn(scanner);
                } else {
                    System.out.println("Ход компьютера...");
                    aiTurn(random);
                }
            }


            System.out.print("Хотите сыграть ещё раз? (да/нет): ");
            String answer = scanner.next().toLowerCase();

            if (!(answer.equals("да") || answer.equals("д"))) {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}