package gr.aueb.cf.challenges.ch4;

import java.util.Scanner;

public class StarsVertical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert the number of stars");
        numberOfStars = scanner.nextInt();

        // Vertical Stars
        System.out.println("Vertical Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.println("*");
        }
        System.out.println();
    }
}
