package gr.aueb.cf.challenges;

import java.util.Scanner;

public class StarsNxM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert the number of stars");
        numberOfStars = scanner.nextInt();

        // Stars nxm
        System.out.println("N x M Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

