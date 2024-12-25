package gr.aueb.cf.challenges.ch4;

import java.util.Scanner;

public class StarsNToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert the number of stars");
        numberOfStars = scanner.nextInt();

        // Descending
        System.out.println("Descending Stars");
        for (int i = numberOfStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
