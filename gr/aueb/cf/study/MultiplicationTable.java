package gr.aueb.cf.study;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.println("Input a number");

        // Read and store the input number
        int num1 = in.nextInt();

        // Use a loop to calculate and print the multiplication table for the input number
        for (int i = 0; i < 10; i++) {
            // Calculate and print the result of num1 multiplied by (i+1)
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}
