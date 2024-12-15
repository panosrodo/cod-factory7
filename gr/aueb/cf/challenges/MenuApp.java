package gr.aueb.cf.challenges;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");
            choice = scanner.nextInt();
        } while (choice !=5);

        System.out.println("You logged out!");

    }
}
