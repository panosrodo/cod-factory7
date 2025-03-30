package gr.aueb.cf.fiveprojects;

import java.util.Scanner;

public class TicTacToe {

    // Ο πίνακας παιχνιδιού 3x3
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Συνάρτηση για την εμφάνιση του πίνακα
    public static void printBoard() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i);
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
                if (j < 2) System.out.print(" |");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---|---|---");
        }
    }

    // Συνάρτηση για τον έλεγχο νίκης
    public static boolean checkWin(char symbol) {
        // Έλεγχος γραμμών, στηλών και διαγωνίων
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||  // Οριζόντια
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {  // Κάθετα
                return true;
            }
        }
        // Διαγώνιοι
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    // Συνάρτηση για τον έλεγχο ισοπαλίας
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;  // Αν βρούμε κενή θέση, δεν είναι ισοπαλία
                }
            }
        }
        return true;  // Αν όλες οι θέσεις είναι γεμάτες
    }

    // Συνάρτηση για την τοποθέτηση του συμβόλου ενός παίκτη
    public static boolean placeMove(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }
        return false;  // Αν η θέση είναι εκτός του πίνακα ή κατειλημμένη
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOver = false;

        // Παίζουμε μέχρι να κερδίσει κάποιος ή να γίνει ισοπαλία
        while (!gameOver) {
            printBoard();  // Εκτυπώνουμε το τρέχον παιχνίδι
            System.out.println("Παίκτης " + currentPlayer + ", εισάγετε τη σειρά (0-2) και στήλη (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Αν η κίνηση είναι έγκυρη, τοποθετούμε το σύμβολο του παίκτη
            if (placeMove(row, col, currentPlayer)) {
                // Έλεγχος αν ο τρέχων παίκτης κέρδισε
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println("Παίκτης " + currentPlayer + " κερδίζει!");
                    gameOver = true;
                }
                // Έλεγχος αν έχουμε ισοπαλία
                else if (checkDraw()) {
                    printBoard();
                    System.out.println("Ισοπαλία!");
                    gameOver = true;
                }
                // Αν δεν κερδίσει ή δεν έχουμε ισοπαλία, αλλάζουμε παίκτη
                else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Η θέση είναι κατειλημμένη, προσπαθήστε ξανά.");
            }
        }

        scanner.close();  // Κλείνουμε τον scanner
    }
}
