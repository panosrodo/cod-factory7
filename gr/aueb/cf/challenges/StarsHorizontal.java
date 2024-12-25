package gr.aueb.cf.challenges;

import java.util.Scanner;

public class StarsHorizontal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert the number of stars");
        numberOfStars = scanner.nextInt();

        // Horizontal Stars
        System.out.println("Horizontal Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
