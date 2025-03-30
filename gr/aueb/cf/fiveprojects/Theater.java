package gr.aueb.cf.fiveprojects;

public class Theater {
    // Δημιουργούμε τον πίνακα με 30 σειρές και 12 στήλες, αρχικά όλα είναι μη κλεισμένα
    private boolean[][] seats = new boolean[30][12];

    // Μέθοδος για να κλείσουμε μια θέση
    public void book(char column, int row) {
        int col = column - 'A';  // Μετατρέπουμε το γράμμα σε αριθμό (A -> 0, B -> 1, κ.λπ.)
        int r = row - 1;  // Προσαρμόζουμε τον αριθμό της σειράς για να είναι 0-based (1 -> 0, 2 -> 1, κ.λπ.)

        // Έλεγχος αν η θέση είναι διαθέσιμη
        if (col >= 0 && col < 12 && r >= 0 && r < 30) {
            if (!seats[r][col]) {
                seats[r][col] = true;  // Κλείνουμε την θέση
                System.out.println("Η θέση " + column + row + " κλείστηκε επιτυχώς.");
            } else {
                System.out.println("Η θέση " + column + row + " είναι ήδη κλεισμένη.");
            }
        } else {
            System.out.println("Η θέση " + column + row + " είναι εκτός ορίων.");
        }
    }

    // Μέθοδος για να ακυρώσουμε μια κράτηση
    public void cancel(char column, int row) {
        int col = column - 'A';  // Μετατρέπουμε το γράμμα σε αριθμό (A -> 0, B -> 1, κ.λπ.)
        int r = row - 1;  // Προσαρμόζουμε τον αριθμό της σειράς για να είναι 0-based (1 -> 0, 2 -> 1, κ.λπ.)

        // Έλεγχος αν η θέση είναι κλεισμένη
        if (col >= 0 && col < 12 && r >= 0 && r < 30) {
            if (seats[r][col]) {
                seats[r][col] = false;  // Ακυρώνουμε την κράτηση
                System.out.println("Η θέση " + column + row + " ακυρώθηκε επιτυχώς.");
            } else {
                System.out.println("Η θέση " + column + row + " δεν είναι κλεισμένη.");
            }
        } else {
            System.out.println("Η θέση " + column + row + " είναι εκτός ορίων.");
        }
    }

    // Μέθοδος για να εκτυπώσουμε τις θέσεις του θεάτρου (για έλεγχο)
    public void printSeats() {
        System.out.println("Θέσεις θεάτρου:");
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (seats[i][j]) {
                    System.out.print("X ");  // X αν είναι κλεισμένη
                } else {
                    System.out.print("O ");  // O αν είναι διαθέσιμη
                }
            }
            System.out.println();
        }
    }

    // Κυρίως πρόγραμμα για δοκιμή
    public static void main(String[] args) {
        Theater theater = new Theater();

        // Δοκιμάζουμε το πρόγραμμα
        theater.book('A', 1);  // Κλείνουμε τη θέση A1
        theater.book('A', 1);  // Δοκιμάζουμε να κλείσουμε ξανά τη θέση A1
        theater.book('B', 2);  // Κλείνουμε τη θέση B2
        theater.cancel('A', 1);  // Ακυρώνουμε τη θέση A1
        theater.cancel('A', 1);  // Δοκιμάζουμε να ακυρώσουμε ξανά τη θέση A1

        // Εκτυπώνουμε τον πίνακα για έλεγχο
        theater.printSeats();
    }
}
