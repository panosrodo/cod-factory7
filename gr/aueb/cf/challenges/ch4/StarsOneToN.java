package gr.aueb.cf.challenges.ch4;

import java.util.Scanner;

public class StarsOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert the number of stars");
        numberOfStars = scanner.nextInt();

        // Ascending
        System.out.println("Ascending Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}