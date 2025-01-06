package gr.aueb.cf.fiveprojects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Αρχικοποιούμε τον πίνακα 128x2
        char[][] charArray = new char[128][2];

        // Διαβάζουμε το αρχείο
        String fileName = "yourfile.txt"; // Δώστε το όνομα του αρχείου σας εδώ
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int character;
            while ((character = reader.read()) != -1) {
                // Αγνοούμε whitespaces (κενά, αλλαγές γραμμής, tab, κλπ)
                if (Character.isWhitespace(character)) {
                    continue;
                }

                // Ελέγχουμε αν ο χαρακτήρας υπάρχει ήδη στον πίνακα
                boolean found = false;
                for (int i = 0; i < 128; i++) {
                    if (charArray[i][0] == character) {
                        charArray[i][1]++; // Αυξάνουμε τη συχνότητα
                        found = true;
                        break;
                    }
                    if (charArray[i][0] == 0) { // Αν η θέση είναι κενή
                        charArray[i][0] = (char) character;
                        charArray[i][1] = 1;
                        found = true;
                        break;
                    }
                }
            }

            // Ταξινόμηση των χαρακτήρων κατά συχνότητα εμφάνισης και κατά χαρακτήρα
            Arrays.sort(charArray, (a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(b[1], a[1]); // Φθίνουσα κατά συχνότητα
                } else {
                    return Character.compare(a[0], b[0]); // Αν η συχνότητα είναι ίδια, ταξινόμηση κατά χαρακτήρα
                }
            });

            // Εκτύπωση των στατιστικών
            System.out.println("Character frequencies:");
            for (int i = 0; i < 128; i++) {
                if (charArray[i][1] > 0) {
                    System.out.println(charArray[i][0] + ": " + charArray[i][1]);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
